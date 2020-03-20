require('chromedriver');

const { Builder, until, By, Key } = require('selenium-webdriver');

const searchYoutubeVideos = async keyword => {
  let driver = await new Builder().forBrowser('chrome').build();
  try {
    await driver.get('https://www.youtube.com');
    await driver.findElement(By.id('search')).sendKeys(keyword, Key.ENTER);
    let videosWithoutPlaylist = await driver.wait(
      until.elementsLocated(By.className('ytd-video-renderer')),
      10000
    )

    console.log('Total videos without playlist', videosWithoutPlaylist.length);

    let videosWithPlaylist = await driver.wait(
      until.elementsLocated(By.className('ytd-playlist-renderer')),
      10000
    )

    console.log('Total videos with playlist: ', videosWithPlaylist.length);

  } finally {
    driver.quit();
  }
}

// search with keyword selenium tutorial
searchYoutubeVideos('selenium tutorial');
