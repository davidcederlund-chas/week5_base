public class Dummy {
    private MockableDummy mockableDummy;

    public Dummy(MockableDummy mockableDummy) {
        this.mockableDummy = mockableDummy;
    }

    public boolean returnTrue() {
        return mockableDummy.returnTrue();
    }
}
