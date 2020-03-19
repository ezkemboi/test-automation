import { AppPage } from './app.po';
import { browser, logging, element, by } from 'protractor';

describe('workspace-project App', () => {
  let page: AppPage;

  beforeEach(() => {
    page = new AppPage();
  });

  it('should display Title in the homepage', () => {
    page.navigateTo();
    expect(page.getTitleText()).toEqual('Test Automation Application');
  });

  it('should get an sample element in navbar', () => {
    page.navigateTo();
    const sampleNavText = element(by.id('sample-nav-link')).getText();
    expect(sampleNavText).toEqual('Sample');
  });

  it('should get all <a> tags in navbar', () => {
    page.navigateTo();
    const sampleATagList = element.all(by.css('.Pages a')).getText();
    expect(sampleATagList).toEqual(['Login', 'Sample', 'Not Found']);
  });

  afterEach(async () => {
    // Assert that there are no errors emitted from the browser
    const logs = await browser.manage().logs().get(logging.Type.BROWSER);
    expect(logs).not.toContain(jasmine.objectContaining({
      level: logging.Level.SEVERE,
    } as logging.Entry));
  });
});
