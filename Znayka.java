public class Znayka extends Hero {


    public Znayka(String name1, String name2) {
        super(name1, name2);
    }
    @Override
    public boolean equals(Object o) {
        boolean a = false;
        if (this == o) {
            a = true;
        }

        if (o == null || getClass() != o.getClass()) {
            a = false;
        }
        return a;
    }

    @Override
    public int hashCode() {
        int result;
        result =  30 * 2 + getName2().hashCode() + getName1().hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "Hero{"
                + getName1()
                + getName2()
                +"}";
    }


}

