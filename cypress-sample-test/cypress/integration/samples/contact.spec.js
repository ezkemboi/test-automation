
describe('Sample Test', () => {
    it('should check matching', () => {
        expect(true).to.equal(true);
    });

    it('should open a website', () => {
        cy.visit('www.google.com')
    })
});
