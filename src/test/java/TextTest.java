import static org.junit.jupiter.api.Assertions.*;

class TextTest {

    @org.junit.jupiter.api.Test
    void sort() {
        String correct = "myth sky lamp catalog drama caramel alpha banana aardvark anaconda panorama extravaganza";
        Text text = new Text("banana myth aardvark catalog drama anaconda sky panorama caramel alpha extravaganza lamp");
        String result = text.sort('a');
        assertEquals(correct, result);
    }
}