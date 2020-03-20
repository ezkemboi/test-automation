require('chromedriver')
const { Builder, By, Key, until } = require('selenium-webdriver');

const getResult = async user => {
  let driver = await new Builder().forBrowser('chrome').build();
  try {
    await driver.get('https://www.google.com');
    await driver.findElement(By.name('q')).sendKeys(user, Key.ENTER);
    let firstResult = await driver.wait(until.elementLocated(By.tagName('h3')), 10000);
    console.log(await firstResult.getAttribute('textContent'))
  }
  finally {
    driver.quit();
  }
}

// run app to get Ezrqn first details
getResult("Ezrqn")
