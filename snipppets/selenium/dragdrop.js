/**
 * snippet for perfoming dragging and dropping
 */
// import Driver
// let builder be equal to new instance of driver
const actions = driver.actions({ bridge: true });
const source = driver.findElement(By.id('source-element-id'));
const target = driver.findElement(By.id('target-element-id'));
await actions.dragAndDrop(source, target).perform();
