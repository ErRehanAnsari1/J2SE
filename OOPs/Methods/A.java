class A {
    private void secret() {
        System.out.println("A's secret");
    }
    public void reveal() {
        secret(); 
    }
}

class B extends A {
    public void secret() {
        System.out.println("B's secret");
    }
}