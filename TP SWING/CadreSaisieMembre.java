import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CadreSaisieMembre extends JFrame {
    public static void main(String[] args) {
        JFrame cadre = new CadreSaisieMembre("Test du cadre de saisie");
        cadre.setLocationRelativeTo(null);
        cadre.setVisible(true);
    }

    public CadreSaisieMembre(String titre) {
        super(titre);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setContentPane(panneauDeContenu());

    }


    private JPanel panneauDeContenu() {
        JPanel p = new JPanel(new BorderLayout());
        JPanel grandCentre = new JPanel(new GridLayout(3, 1));
        JPanel grandEst = new JPanel(new GridLayout(0, 1));
        JPanel grandSud = new JPanel(new FlowLayout());


        JCheckBox[] caseACocherSports = new JCheckBox[Sports.NOMBRE];

        p.add(grandCentre, BorderLayout.CENTER);
        p.add(grandEst, BorderLayout.EAST);
        p.add(grandSud, BorderLayout.SOUTH);
        for (int i = 0; i < Sports.NOMBRE; i++) {
            caseACocherSports[i] = new JCheckBox(Sports.values()[i].toString());
            grandEst.add(caseACocherSports[i]);
        }
        JLabel labelNom = new JLabel("Nom");
        JLabel labelPrenom = new JLabel("Prènom");
        JLabel labelAdresse = new JLabel("Adresse");
        JTextField txtNom = new JTextField();
        JTextField txtPrenom = new JTextField();
        JTextArea txtAdresse = new JTextArea();
        JRadioButton rdHomme = new JRadioButton("Homme");
        JRadioButton rdFemme = new JRadioButton("Femme");
        rdHomme.setSelected(true);
        ButtonGroup groupeBtn = new ButtonGroup();
        groupeBtn.add(rdHomme);
        groupeBtn.add(rdFemme);

        JLabel labelSex = new JLabel("Sexe");
        JButton buttonOK = new JButton("OK");
        JButton buttonAnnuler = new JButton("Annuler");
        grandCentre.add(labelNom);
        grandCentre.add(txtNom);
        grandCentre.add(labelPrenom);
        grandCentre.add(txtPrenom);
        grandCentre.add(labelAdresse);
        grandCentre.add(txtAdresse);
        grandSud.add(labelSex);
        grandSud.add(rdHomme);
        grandSud.add(rdFemme);
        grandSud.add(buttonOK);
        grandSud.add(buttonAnnuler);
        return p;

        buttonOK.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent E) {
                String ch = "";
                ch += txtNom.getText();
                ch += txtPrenom.getText();
                ch += txtAdresse.getText();
                if (rdHomme.isSelected()) {
                    ch += "Sexe : Homme" + " ";
                } else {
                    ch += "Sexe : Femme" + " ";
                }
                for (int i = 0; i <= Sports.NOMBRE; i++) {
                    if (caseACocherSports[i].isSelected()) {
                        ch += caseACocherSports[i].getText();
                    }
                }
                JOptionPane.showMessageDialog(null, ch, "Information", JOptionPane.INFORMATION_MESSAGE);

            }

        });


    }

}
}
