// Target Interface
interface HDMI {
    void displayHDMI();
}

// Adaptee Class
class VGA {
    void displayVGA() {
        System.out.println("Displaying through VGA");
    }
}

// Adapter Class
class VGAtoHDMIAdapter implements HDMI {
    private VGA vga;

    public VGAtoHDMIAdapter(VGA vga) {
        this.vga = vga;
    }

    @Override
    public void displayHDMI() {
        // Convert VGA to HDMI
        vga.displayVGA();
        System.out.println("Converted VGA to HDMI");
    }
}

// Client Code
public class AdapterDesign {
    public static void main(String[] args) {
        VGA vga = new VGA();
        HDMI hdmiAdapter = new VGAtoHDMIAdapter(vga);
        
        // Client using HDMI interface
        hdmiAdapter.displayHDMI();  
    }
}