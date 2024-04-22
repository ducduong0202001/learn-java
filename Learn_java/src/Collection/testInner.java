package Collection;

import java.io.IOException;
import java.lang.invoke.StringConcatFactory;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.sql.SQLOutput;
import java.util.*;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class testInner {

    public static void main(String args[]) {
        List<String> dogs = new ArrayList<>();
        dogs.add("sa");
        dogs.add("bc");
        dogs.add("bc");
        UnaryOperator<String> convert = (t) -> t.toUpperCase();
        dogs.replaceAll(convert);
        dogs.forEach(t-> System.out.println(t));
    }
}
