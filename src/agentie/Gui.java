package agentie;

import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Locale;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

public final class Gui extends javax.swing.JFrame {

    Agentie agentie;
    NumberFormat currencyFormatter;
    String bugetAgentie;
    DefaultListModel listaAgentie;
    DefaultListModel listaClienti;
    DefaultListModel listaLocuinte;

    public Gui() {
        initComponents();
        this.setLocationRelativeTo(null);
        clientiDialoxBox.setLocationRelativeTo(null);
        locuinteDialoxBox.setLocationRelativeTo(null);
        adaugaClientLocuintaDialogBox.setLocationRelativeTo(null);
        adaugaClientCumparatorDialogBox.setLocationRelativeTo(null);
        
        Locale locale = new Locale("fr", "FR");
        currencyFormatter = NumberFormat.getCurrencyInstance(locale);
        listaAgentie = new DefaultListModel();
        listaClienti = new DefaultListModel();
        listaLocuinte = new DefaultListModel();

        //test
        agentie = new Agentie("Agentia ta", "Splaiul Independentei, 290", 250000);
        populareTest();

        //final test
        listaInformatiiAgentie.setModel(listaAgentie);
        listaInformatiiClienti.setModel(listaClienti);
        listaInformatiiLocuinte.setModel(listaLocuinte);

        bugetAgentie = currencyFormatter.format(agentie.getBuget());
        labelNumeAgentie.setText(agentie.getNume());
        labelAdresaAgentie.setText("Adresa: " + agentie.getAdresa());
        labelBugetAgentie.setText("Buget: " + bugetAgentie);

        populareListaAgentie();
        populareListaClienti();
        populareListaLocuinte();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        clientiDialoxBox = new javax.swing.JDialog();
        jScrollPane2 = new javax.swing.JScrollPane();
        listaInformatiiClienti = new javax.swing.JList<>();
        butonAdaugaClientVanzator = new javax.swing.JButton();
        butonAdaugaClientCumparator = new javax.swing.JButton();
        butonExitFereastraClienti = new javax.swing.JButton();
        labelInfoClienti = new javax.swing.JLabel();
        butonCumparaLocuinta = new javax.swing.JButton();
        vindeLocuinta = new javax.swing.JButton();
        butonInchiriazaLocuinta = new javax.swing.JButton();
        locuinteDialoxBox = new javax.swing.JDialog();
        jScrollPane3 = new javax.swing.JScrollPane();
        listaInformatiiLocuinte = new javax.swing.JList<>();
        butonExitFereastraLocuinte = new javax.swing.JButton();
        labelStructuraLista = new javax.swing.JLabel();
        adaugaClientLocuintaDialogBox = new javax.swing.JDialog();
        butonOkAdaugaClientLocuinta = new javax.swing.JButton();
        butonExitFereastraAdaugaClientLocuinta = new javax.swing.JButton();
        butonCancelAdaugaClientLocuinta = new javax.swing.JButton();
        labelAdresa = new javax.swing.JLabel();
        labelSuprafata = new javax.swing.JLabel();
        labelNumarCamere = new javax.swing.JLabel();
        labelPretVanzare = new javax.swing.JLabel();
        labelPretInchiriere = new javax.swing.JLabel();
        textFieldAdresa = new javax.swing.JTextField();
        textFieldSuprafata = new javax.swing.JTextField();
        textFieldNrCamere = new javax.swing.JTextField();
        textFieldPretVanzare = new javax.swing.JTextField();
        textFieldPretInchiriere = new javax.swing.JTextField();
        labelSuprafataMp = new javax.swing.JLabel();
        labelPretVanzareEUR = new javax.swing.JLabel();
        labelPretInchiriereEUR = new javax.swing.JLabel();
        labelLocuinta = new javax.swing.JLabel();
        labelClientVanzator = new javax.swing.JLabel();
        labelNumeClient = new javax.swing.JLabel();
        labelVarstaClient = new javax.swing.JLabel();
        textFieldNume = new javax.swing.JTextField();
        textFieldVarsta = new javax.swing.JTextField();
        labelVarstaAni = new javax.swing.JLabel();
        adaugaClientCumparatorDialogBox = new javax.swing.JDialog();
        butonOkAdaugaClientCumparator = new javax.swing.JButton();
        butonExitFereastraAdaugaClientCumparator = new javax.swing.JButton();
        butonCancelAdaugaClientCumparator = new javax.swing.JButton();
        labelClienCumparator = new javax.swing.JLabel();
        labelNumeClientCumparator = new javax.swing.JLabel();
        labelVarstaClientCumparator = new javax.swing.JLabel();
        textFieldNumeClientCumparator = new javax.swing.JTextField();
        textFieldBugetClientCumparator = new javax.swing.JTextField();
        labelVarstaAni1 = new javax.swing.JLabel();
        labelBugetClientCumparator = new javax.swing.JLabel();
        textFieldVarstaClientCumparator = new javax.swing.JTextField();
        labelBugetEUR = new javax.swing.JLabel();
        labelNumeAgentie = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        listaInformatiiAgentie = new javax.swing.JList<>();
        panelButoane = new javax.swing.JPanel();
        butonAfisareClienti = new javax.swing.JButton();
        butonAfisareLocuinte = new javax.swing.JButton();
        butonExit = new javax.swing.JButton();
        butonAfisareAgentiVanzari = new javax.swing.JButton();
        butonSchimbaNumeAgentie = new javax.swing.JButton();
        butonSchimbaBugetAgentie = new javax.swing.JButton();
        panelInformatiiAgentie = new javax.swing.JPanel();
        labelAdresaAgentie = new javax.swing.JLabel();
        labelBugetAgentie = new javax.swing.JLabel();

        clientiDialoxBox.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        clientiDialoxBox.setTitle("Informatii clienti Agentie");
        clientiDialoxBox.setMinimumSize(new java.awt.Dimension(561, 399));
        clientiDialoxBox.setModalityType(java.awt.Dialog.ModalityType.APPLICATION_MODAL);
        clientiDialoxBox.setResizable(false);

        jScrollPane2.setViewportView(listaInformatiiClienti);

        butonAdaugaClientVanzator.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        butonAdaugaClientVanzator.setText("Adauga Client Vanzator");
        butonAdaugaClientVanzator.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butonAdaugaClientVanzatorActionPerformed(evt);
            }
        });

        butonAdaugaClientCumparator.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        butonAdaugaClientCumparator.setText("Adauga Client Cumparator");
        butonAdaugaClientCumparator.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butonAdaugaClientCumparatorActionPerformed(evt);
            }
        });

        butonExitFereastraClienti.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        butonExitFereastraClienti.setText("Exit");
        butonExitFereastraClienti.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butonExitFereastraClientiActionPerformed(evt);
            }
        });

        labelInfoClienti.setFont(new java.awt.Font("Times New Roman", 2, 12)); // NOI18N
        labelInfoClienti.setText("*Clientii cumparatori au afisat bugetul de care dispun, iar clientii vanzatori au afisat pretul locuintei pe care o vand.");

        butonCumparaLocuinta.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        butonCumparaLocuinta.setText("Cumpara Locuinta");
        butonCumparaLocuinta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butonCumparaLocuintaActionPerformed(evt);
            }
        });

        vindeLocuinta.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        vindeLocuinta.setText("Vinde Locuinta");
        vindeLocuinta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vindeLocuintaActionPerformed(evt);
            }
        });

        butonInchiriazaLocuinta.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        butonInchiriazaLocuinta.setText("Inchiriaza Locuinta");
        butonInchiriazaLocuinta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butonInchiriazaLocuintaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout clientiDialoxBoxLayout = new javax.swing.GroupLayout(clientiDialoxBox.getContentPane());
        clientiDialoxBox.getContentPane().setLayout(clientiDialoxBoxLayout);
        clientiDialoxBoxLayout.setHorizontalGroup(
            clientiDialoxBoxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(clientiDialoxBoxLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(clientiDialoxBoxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, clientiDialoxBoxLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(clientiDialoxBoxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(butonAdaugaClientVanzator, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(butonAdaugaClientCumparator, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26))
                    .addGroup(clientiDialoxBoxLayout.createSequentialGroup()
                        .addGroup(clientiDialoxBoxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(clientiDialoxBoxLayout.createSequentialGroup()
                                .addGap(88, 88, 88)
                                .addComponent(butonExitFereastraClienti, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(clientiDialoxBoxLayout.createSequentialGroup()
                                .addGap(59, 59, 59)
                                .addGroup(clientiDialoxBoxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(butonCumparaLocuinta)
                                    .addComponent(butonInchiriazaLocuinta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(vindeLocuinta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(clientiDialoxBoxLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(labelInfoClienti)
                .addGap(0, 18, Short.MAX_VALUE))
        );
        clientiDialoxBoxLayout.setVerticalGroup(
            clientiDialoxBoxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(clientiDialoxBoxLayout.createSequentialGroup()
                .addGroup(clientiDialoxBoxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(clientiDialoxBoxLayout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 311, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(clientiDialoxBoxLayout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addComponent(butonAdaugaClientVanzator)
                        .addGap(18, 18, 18)
                        .addComponent(butonAdaugaClientCumparator)
                        .addGap(58, 58, 58)
                        .addComponent(butonCumparaLocuinta)
                        .addGap(18, 18, 18)
                        .addComponent(butonInchiriazaLocuinta)
                        .addGap(18, 18, 18)
                        .addComponent(vindeLocuinta)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(butonExitFereastraClienti)))
                .addGap(18, 18, 18)
                .addComponent(labelInfoClienti)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        locuinteDialoxBox.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        locuinteDialoxBox.setTitle("Informatii locuinte Agentie");
        locuinteDialoxBox.setModalityType(java.awt.Dialog.ModalityType.APPLICATION_MODAL);
        locuinteDialoxBox.setResizable(false);

        jScrollPane3.setViewportView(listaInformatiiLocuinte);

        butonExitFereastraLocuinte.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        butonExitFereastraLocuinte.setText("Exit");
        butonExitFereastraLocuinte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butonExitFereastraLocuinteActionPerformed(evt);
            }
        });

        labelStructuraLista.setBackground(new java.awt.Color(255, 255, 255));
        labelStructuraLista.setFont(new java.awt.Font("Times New Roman", 2, 12)); // NOI18N
        labelStructuraLista.setText(" Adresa                     Suprafata               Numar Camere              Pret vanzare        Pret inchiriere");

        javax.swing.GroupLayout locuinteDialoxBoxLayout = new javax.swing.GroupLayout(locuinteDialoxBox.getContentPane());
        locuinteDialoxBox.getContentPane().setLayout(locuinteDialoxBoxLayout);
        locuinteDialoxBoxLayout.setHorizontalGroup(
            locuinteDialoxBoxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(locuinteDialoxBoxLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(locuinteDialoxBoxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(labelStructuraLista, javax.swing.GroupLayout.DEFAULT_SIZE, 467, Short.MAX_VALUE)
                    .addComponent(jScrollPane3))
                .addGap(43, 43, 43)
                .addComponent(butonExitFereastraLocuinte, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );
        locuinteDialoxBoxLayout.setVerticalGroup(
            locuinteDialoxBoxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(locuinteDialoxBoxLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(labelStructuraLista, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(locuinteDialoxBoxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, locuinteDialoxBoxLayout.createSequentialGroup()
                        .addGap(166, 166, 166)
                        .addComponent(butonExitFereastraLocuinte))
                    .addComponent(jScrollPane3))
                .addContainerGap(33, Short.MAX_VALUE))
        );

        adaugaClientLocuintaDialogBox.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        adaugaClientLocuintaDialogBox.setTitle("Adauga client vanzator");
        adaugaClientLocuintaDialogBox.setModalityType(java.awt.Dialog.ModalityType.APPLICATION_MODAL);
        adaugaClientLocuintaDialogBox.setResizable(false);

        butonOkAdaugaClientLocuinta.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        butonOkAdaugaClientLocuinta.setText("Ok");
        butonOkAdaugaClientLocuinta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butonOkAdaugaClientLocuintaActionPerformed(evt);
            }
        });

        butonExitFereastraAdaugaClientLocuinta.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        butonExitFereastraAdaugaClientLocuinta.setText("Exit");
        butonExitFereastraAdaugaClientLocuinta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butonExitFereastraAdaugaClientLocuintaActionPerformed(evt);
            }
        });

        butonCancelAdaugaClientLocuinta.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        butonCancelAdaugaClientLocuinta.setText("Cancel");
        butonCancelAdaugaClientLocuinta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butonCancelAdaugaClientLocuintaActionPerformed(evt);
            }
        });

        labelAdresa.setText("Adresa:");

        labelSuprafata.setText("Suprafata:");

        labelNumarCamere.setText("Nr. camere:");

        labelPretVanzare.setText("Pret Vanzare:");

        labelPretInchiriere.setText("Pret Inchiriere:");

        labelSuprafataMp.setText("mp");

        labelPretVanzareEUR.setText("EUR");

        labelPretInchiriereEUR.setText("EUR");

        labelLocuinta.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        labelLocuinta.setText("Locuinta");

        labelClientVanzator.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        labelClientVanzator.setText("Client Vanzator");

        labelNumeClient.setText("Nume:");

        labelVarstaClient.setText("Varsta:");

        labelVarstaAni.setText("ani");

        javax.swing.GroupLayout adaugaClientLocuintaDialogBoxLayout = new javax.swing.GroupLayout(adaugaClientLocuintaDialogBox.getContentPane());
        adaugaClientLocuintaDialogBox.getContentPane().setLayout(adaugaClientLocuintaDialogBoxLayout);
        adaugaClientLocuintaDialogBoxLayout.setHorizontalGroup(
            adaugaClientLocuintaDialogBoxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(adaugaClientLocuintaDialogBoxLayout.createSequentialGroup()
                .addGap(211, 211, 211)
                .addGroup(adaugaClientLocuintaDialogBoxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(adaugaClientLocuintaDialogBoxLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(butonExitFereastraAdaugaClientLocuinta, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(adaugaClientLocuintaDialogBoxLayout.createSequentialGroup()
                        .addComponent(labelLocuinta)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 111, Short.MAX_VALUE)
                        .addGroup(adaugaClientLocuintaDialogBoxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(butonOkAdaugaClientLocuinta, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(butonCancelAdaugaClientLocuinta, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(24, 24, 24))
            .addGroup(adaugaClientLocuintaDialogBoxLayout.createSequentialGroup()
                .addGroup(adaugaClientLocuintaDialogBoxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(adaugaClientLocuintaDialogBoxLayout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(adaugaClientLocuintaDialogBoxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(adaugaClientLocuintaDialogBoxLayout.createSequentialGroup()
                                .addComponent(labelPretVanzare)
                                .addGap(18, 18, 18)
                                .addComponent(textFieldPretVanzare, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(labelPretVanzareEUR))
                            .addGroup(adaugaClientLocuintaDialogBoxLayout.createSequentialGroup()
                                .addGroup(adaugaClientLocuintaDialogBoxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(labelSuprafata)
                                    .addGroup(adaugaClientLocuintaDialogBoxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(labelNumeClient)
                                        .addComponent(labelAdresa)
                                        .addComponent(labelVarstaClient)))
                                .addGap(32, 32, 32)
                                .addGroup(adaugaClientLocuintaDialogBoxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(adaugaClientLocuintaDialogBoxLayout.createSequentialGroup()
                                        .addComponent(textFieldSuprafata, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(labelSuprafataMp))
                                    .addComponent(textFieldAdresa, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(textFieldNume, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(adaugaClientLocuintaDialogBoxLayout.createSequentialGroup()
                                        .addComponent(textFieldVarsta, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(labelVarstaAni))))
                            .addGroup(adaugaClientLocuintaDialogBoxLayout.createSequentialGroup()
                                .addComponent(labelNumarCamere)
                                .addGap(27, 27, 27)
                                .addComponent(textFieldNrCamere, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(adaugaClientLocuintaDialogBoxLayout.createSequentialGroup()
                                .addComponent(labelPretInchiriere)
                                .addGap(12, 12, 12)
                                .addComponent(textFieldPretInchiriere, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(labelPretInchiriereEUR))))
                    .addGroup(adaugaClientLocuintaDialogBoxLayout.createSequentialGroup()
                        .addGap(202, 202, 202)
                        .addComponent(labelClientVanzator)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        adaugaClientLocuintaDialogBoxLayout.setVerticalGroup(
            adaugaClientLocuintaDialogBoxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(adaugaClientLocuintaDialogBoxLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(labelClientVanzator)
                .addGap(18, 18, 18)
                .addGroup(adaugaClientLocuintaDialogBoxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(adaugaClientLocuintaDialogBoxLayout.createSequentialGroup()
                        .addGroup(adaugaClientLocuintaDialogBoxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(adaugaClientLocuintaDialogBoxLayout.createSequentialGroup()
                                .addComponent(butonOkAdaugaClientLocuinta)
                                .addGap(18, 18, 18)
                                .addGroup(adaugaClientLocuintaDialogBoxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(butonCancelAdaugaClientLocuinta)
                                    .addComponent(labelVarstaClient)
                                    .addComponent(textFieldVarsta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(labelVarstaAni)))
                            .addGroup(adaugaClientLocuintaDialogBoxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(labelNumeClient)
                                .addComponent(textFieldNume, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, adaugaClientLocuintaDialogBoxLayout.createSequentialGroup()
                        .addGap(105, 105, 105)
                        .addComponent(labelLocuinta)
                        .addGap(18, 18, 18)))
                .addGroup(adaugaClientLocuintaDialogBoxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textFieldAdresa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelAdresa))
                .addGap(18, 18, 18)
                .addGroup(adaugaClientLocuintaDialogBoxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textFieldSuprafata, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelSuprafata)
                    .addComponent(labelSuprafataMp))
                .addGap(20, 20, 20)
                .addGroup(adaugaClientLocuintaDialogBoxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelNumarCamere)
                    .addComponent(textFieldNrCamere, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(adaugaClientLocuintaDialogBoxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelPretVanzare)
                    .addComponent(textFieldPretVanzare, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelPretVanzareEUR))
                .addGap(18, 18, 18)
                .addGroup(adaugaClientLocuintaDialogBoxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelPretInchiriere)
                    .addComponent(textFieldPretInchiriere, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelPretInchiriereEUR)
                    .addComponent(butonExitFereastraAdaugaClientLocuinta))
                .addGap(25, 25, 25))
        );

        adaugaClientCumparatorDialogBox.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        adaugaClientCumparatorDialogBox.setTitle("Adauga client cumparator");
        adaugaClientCumparatorDialogBox.setModalityType(java.awt.Dialog.ModalityType.APPLICATION_MODAL);
        adaugaClientCumparatorDialogBox.setResizable(false);

        butonOkAdaugaClientCumparator.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        butonOkAdaugaClientCumparator.setText("Ok");
        butonOkAdaugaClientCumparator.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butonOkAdaugaClientCumparatorActionPerformed(evt);
            }
        });

        butonExitFereastraAdaugaClientCumparator.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        butonExitFereastraAdaugaClientCumparator.setText("Exit");
        butonExitFereastraAdaugaClientCumparator.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butonExitFereastraAdaugaClientCumparatorActionPerformed(evt);
            }
        });

        butonCancelAdaugaClientCumparator.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        butonCancelAdaugaClientCumparator.setText("Cancel");
        butonCancelAdaugaClientCumparator.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butonCancelAdaugaClientCumparatorActionPerformed(evt);
            }
        });

        labelClienCumparator.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        labelClienCumparator.setText("Client Cumparator");

        labelNumeClientCumparator.setText("Nume:");

        labelVarstaClientCumparator.setText("Varsta:");

        labelVarstaAni1.setText("ani");

        labelBugetClientCumparator.setText("Buget:");

        labelBugetEUR.setText("EUR");

        javax.swing.GroupLayout adaugaClientCumparatorDialogBoxLayout = new javax.swing.GroupLayout(adaugaClientCumparatorDialogBox.getContentPane());
        adaugaClientCumparatorDialogBox.getContentPane().setLayout(adaugaClientCumparatorDialogBoxLayout);
        adaugaClientCumparatorDialogBoxLayout.setHorizontalGroup(
            adaugaClientCumparatorDialogBoxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(adaugaClientCumparatorDialogBoxLayout.createSequentialGroup()
                .addGap(211, 371, Short.MAX_VALUE)
                .addGroup(adaugaClientCumparatorDialogBoxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(butonOkAdaugaClientCumparator, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(butonCancelAdaugaClientCumparator, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(adaugaClientCumparatorDialogBoxLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(butonExitFereastraAdaugaClientCumparator, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(24, 24, 24))
            .addGroup(adaugaClientCumparatorDialogBoxLayout.createSequentialGroup()
                .addGroup(adaugaClientCumparatorDialogBoxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(adaugaClientCumparatorDialogBoxLayout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(adaugaClientCumparatorDialogBoxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(labelNumeClientCumparator)
                            .addComponent(labelVarstaClientCumparator)
                            .addComponent(labelBugetClientCumparator))
                        .addGap(46, 46, 46)
                        .addGroup(adaugaClientCumparatorDialogBoxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(textFieldNumeClientCumparator, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(adaugaClientCumparatorDialogBoxLayout.createSequentialGroup()
                                .addComponent(textFieldBugetClientCumparator, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(labelBugetEUR))
                            .addGroup(adaugaClientCumparatorDialogBoxLayout.createSequentialGroup()
                                .addComponent(textFieldVarstaClientCumparator, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(labelVarstaAni1))))
                    .addGroup(adaugaClientCumparatorDialogBoxLayout.createSequentialGroup()
                        .addGap(193, 193, 193)
                        .addComponent(labelClienCumparator)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        adaugaClientCumparatorDialogBoxLayout.setVerticalGroup(
            adaugaClientCumparatorDialogBoxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(adaugaClientCumparatorDialogBoxLayout.createSequentialGroup()
                .addContainerGap(15, Short.MAX_VALUE)
                .addComponent(labelClienCumparator)
                .addGap(18, 18, 18)
                .addGroup(adaugaClientCumparatorDialogBoxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(adaugaClientCumparatorDialogBoxLayout.createSequentialGroup()
                        .addComponent(butonOkAdaugaClientCumparator)
                        .addGap(18, 18, 18)
                        .addGroup(adaugaClientCumparatorDialogBoxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(butonCancelAdaugaClientCumparator)
                            .addComponent(labelVarstaClientCumparator)
                            .addComponent(labelVarstaAni1)
                            .addComponent(textFieldVarstaClientCumparator, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(adaugaClientCumparatorDialogBoxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(labelNumeClientCumparator)
                        .addComponent(textFieldNumeClientCumparator, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addGroup(adaugaClientCumparatorDialogBoxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelBugetClientCumparator)
                    .addComponent(textFieldBugetClientCumparator, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelBugetEUR))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(butonExitFereastraAdaugaClientCumparator)
                .addGap(30, 30, 30))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new java.awt.GridBagLayout());

        labelNumeAgentie.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        labelNumeAgentie.setText("Nume");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.insets = new java.awt.Insets(20, 0, 15, 0);
        getContentPane().add(labelNumeAgentie, gridBagConstraints);

        listaInformatiiAgentie.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        listaInformatiiAgentie.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        listaInformatiiAgentie.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        listaInformatiiAgentie.setToolTipText("Informatii despre agentie");
        listaInformatiiAgentie.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        listaInformatiiAgentie.setEnabled(false);
        jScrollPane1.setViewportView(listaInformatiiAgentie);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 226;
        gridBagConstraints.ipady = 350;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(16, 16, 15, 15);
        getContentPane().add(jScrollPane1, gridBagConstraints);

        panelButoane.setLayout(new java.awt.GridBagLayout());

        butonAfisareClienti.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        butonAfisareClienti.setText("Clienti");
        butonAfisareClienti.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butonAfisareClientiActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 60;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(15, 15, 15, 15);
        panelButoane.add(butonAfisareClienti, gridBagConstraints);

        butonAfisareLocuinte.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        butonAfisareLocuinte.setText("Locuinte");
        butonAfisareLocuinte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butonAfisareLocuinteActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.ipadx = 46;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(15, 15, 15, 15);
        panelButoane.add(butonAfisareLocuinte, gridBagConstraints);

        butonExit.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        butonExit.setText("Exit");
        butonExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butonExitActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.ipadx = 72;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(100, 15, 15, 15);
        panelButoane.add(butonExit, gridBagConstraints);

        butonAfisareAgentiVanzari.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        butonAfisareAgentiVanzari.setText("Agenti Vanzare");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.ipadx = 10;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(15, 15, 15, 15);
        panelButoane.add(butonAfisareAgentiVanzari, gridBagConstraints);

        butonSchimbaNumeAgentie.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        butonSchimbaNumeAgentie.setText("Schimba Nume");
        butonSchimbaNumeAgentie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butonSchimbaNumeAgentieActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.ipadx = 9;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(15, 15, 15, 15);
        panelButoane.add(butonSchimbaNumeAgentie, gridBagConstraints);

        butonSchimbaBugetAgentie.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        butonSchimbaBugetAgentie.setText("Schimba Buget");
        butonSchimbaBugetAgentie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butonSchimbaBugetAgentieActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.ipadx = 11;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(15, 15, 15, 15);
        panelButoane.add(butonSchimbaBugetAgentie, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 0.1;
        gridBagConstraints.weighty = 0.1;
        gridBagConstraints.insets = new java.awt.Insets(15, 16, 15, 15);
        getContentPane().add(panelButoane, gridBagConstraints);

        panelInformatiiAgentie.setLayout(new java.awt.GridBagLayout());

        labelAdresaAgentie.setFont(new java.awt.Font("Times New Roman", 2, 14)); // NOI18N
        labelAdresaAgentie.setText("Adresa");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(15, 15, 10, 15);
        panelInformatiiAgentie.add(labelAdresaAgentie, gridBagConstraints);

        labelBugetAgentie.setFont(new java.awt.Font("Times New Roman", 2, 14)); // NOI18N
        labelBugetAgentie.setText("Buget");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(15, 300, 10, 15);
        panelInformatiiAgentie.add(labelBugetAgentie, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 102;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.SOUTH;
        getContentPane().add(panelInformatiiAgentie, gridBagConstraints);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void butonExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butonExitActionPerformed
        iesire();
    }//GEN-LAST:event_butonExitActionPerformed

    public void populareListaAgentie() {
        listaAgentie.addElement("Nume agentie: " + agentie.getNume());
        listaAgentie.addElement("Buget agentie: " + bugetAgentie);
        listaAgentie.addElement("Numar clieniti agentie: "
                + (agentie.getClientiCumparatori().size() + agentie.getClientiVanzatori().size()));
        listaAgentie.addElement("Numar locuinte agentie: "
                + (agentie.getLocuinte().size() + agentie.getLocuinteInchiriate().size()));
        listaAgentie.addElement("Adresa agentie: " + agentie.getAdresa());
    }
    
    public void populareListaClienti() {
        for(ClientCumparator clientCumparator: agentie.getClientiCumparatori()) {
            listaClienti.addElement(clientCumparator);
        }
        for(ClientVanzator clientVanzator: agentie.getClientiVanzatori()) {
            listaClienti.addElement(clientVanzator);
        }
    }
    
    public void populareListaLocuinte() {
        for(Locuinta locuinta: agentie.getLocuinte()) {
            listaLocuinte.addElement(locuinta + "  |  normala");
        }
        for(Locuinta locuintaInchiriata: agentie.getLocuinteInchiriate()) {
            listaLocuinte.addElement(locuintaInchiriata + "  |  inchiriata");
        }
    }
    
    private void butonSchimbaNumeAgentieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butonSchimbaNumeAgentieActionPerformed
        String nume = JOptionPane.showInputDialog(this, "Scrie numele nou al agentiei",
                "Schimbare nume agentie", JOptionPane.PLAIN_MESSAGE);
        try {
            if ((nume != null) || (nume.length() > 0)) {
                agentie.setNume(nume);
                labelNumeAgentie.setText(agentie.getNume());
                listaAgentie.setElementAt("Nume agentie: " + agentie.getNume(), 0);
            }
        } catch (NullPointerException e) {

        }
    }//GEN-LAST:event_butonSchimbaNumeAgentieActionPerformed

    private void butonSchimbaBugetAgentieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butonSchimbaBugetAgentieActionPerformed
        try {
            String buget = JOptionPane.showInputDialog(this, "Introdu noul buget(>0)",
                    "Schimbare buget agentie", JOptionPane.PLAIN_MESSAGE);

            double buget1 = Double.valueOf(buget);
            if (buget1 < 0) {
                throw new IllegalArgumentException("Suma introdusa nu poate fi negativa");
            } else {
                agentie.setBuget(buget1);
                bugetAgentie = currencyFormatter.format(agentie.getBuget());
                labelBugetAgentie.setText("Buget: " + bugetAgentie);
                listaAgentie.setElementAt("Buget agentie: " + bugetAgentie, 1);
            }
        } catch (IllegalArgumentException e) {
            JOptionPane.showMessageDialog(this, e.getMessage(), "Eroare", JOptionPane.ERROR_MESSAGE);
        } catch (NullPointerException e) {

        }
    }//GEN-LAST:event_butonSchimbaBugetAgentieActionPerformed

    private void butonExitFereastraClientiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butonExitFereastraClientiActionPerformed
        clientiDialoxBox.dispose();
    }//GEN-LAST:event_butonExitFereastraClientiActionPerformed

    private void butonAfisareClientiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butonAfisareClientiActionPerformed
        clientiDialoxBox.pack();
        clientiDialoxBox.setVisible(true);
    }//GEN-LAST:event_butonAfisareClientiActionPerformed

    private void vindeLocuintaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vindeLocuintaActionPerformed
        int index = 0;
        Persoana p = null;
        try{
            index = listaInformatiiClienti.getSelectedIndex();
            p = (Persoana) listaClienti.getElementAt(index);
        } catch (ArrayIndexOutOfBoundsException e){
            JOptionPane.showMessageDialog(this, "Selecteaza un client!",
                "Selecteaza", JOptionPane.WARNING_MESSAGE);
        }
        try{
            if(!p.getStatut().equals("vanzator")) {
                JOptionPane.showMessageDialog(this, "Clientul selectat nu este vanzator!",
                    "Eroare", JOptionPane.ERROR_MESSAGE);
            } else {

            }
        } catch (NullPointerException e) {

        }
    }//GEN-LAST:event_vindeLocuintaActionPerformed

    private void butonCumparaLocuintaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butonCumparaLocuintaActionPerformed
        int index = 0;
        Persoana p = null;
        try{
            index = listaInformatiiClienti.getSelectedIndex();
            p = (Persoana) listaClienti.getElementAt(index);
        } catch (ArrayIndexOutOfBoundsException e){
            JOptionPane.showMessageDialog(this, "Selecteaza un client!",
                "Selecteaza", JOptionPane.WARNING_MESSAGE);
        }
        try{
            if(!p.getStatut().equals("cumparator")) {
                JOptionPane.showMessageDialog(this, "Clientul selectat nu este cumparator!",
                    "Eroare", JOptionPane.ERROR_MESSAGE);
            } else {

            }
        } catch (NullPointerException e) {

        }
    }//GEN-LAST:event_butonCumparaLocuintaActionPerformed

    private void butonAfisareLocuinteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butonAfisareLocuinteActionPerformed
        locuinteDialoxBox.pack();
        locuinteDialoxBox.setVisible(true);
    }//GEN-LAST:event_butonAfisareLocuinteActionPerformed

    private void butonExitFereastraLocuinteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butonExitFereastraLocuinteActionPerformed
        locuinteDialoxBox.dispose();
    }//GEN-LAST:event_butonExitFereastraLocuinteActionPerformed

    private void butonExitFereastraAdaugaClientLocuintaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butonExitFereastraAdaugaClientLocuintaActionPerformed
        adaugaClientLocuintaDialogBox.dispose();
    }//GEN-LAST:event_butonExitFereastraAdaugaClientLocuintaActionPerformed

    private void butonOkAdaugaClientLocuintaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butonOkAdaugaClientLocuintaActionPerformed
        String adresa = null;
        String nume = null;
        double suprafata = 0;
        int numarCamere = 0;
        int varsta = 0;
        double pretVanzare = 0;
        double pretInchiriere = 0;
        
        try {
            adresa = textFieldAdresa.getText();
            nume = textFieldNume.getText();
        } catch(NullPointerException e) {
            JOptionPane.showMessageDialog(this, "Introdu adresa!",
                "Eroare", JOptionPane.ERROR_MESSAGE);
        }
        try {       
            varsta = Integer.valueOf(textFieldVarsta.getText());
            suprafata = Double.valueOf(textFieldSuprafata.getText());
            numarCamere = Integer.valueOf(textFieldNrCamere.getText());
            pretVanzare = Double.valueOf(textFieldPretVanzare.getText());
            pretInchiriere = Double.valueOf(textFieldPretInchiriere.getText());
            
            Locuinta loc = new Locuinta();
            loc.setAdresa(adresa);
            loc.setNrCamere(numarCamere);
            loc.setPretInchiriere(pretInchiriere);
            loc.setPretVanzare(pretVanzare);
            loc.setSuprafata(suprafata);
            listaLocuinte.addElement(loc + "  |  normala");
            ClientVanzator clientVanzator = new ClientVanzator(nume, varsta, loc);
            listaClienti.addElement(clientVanzator);
            
            agentie.adaugaLocuinta(loc);
            agentie.adaugaClientVanzator(clientVanzator);
            
            //refresh lista agentie
            listaAgentie.setElementAt("Numar clieniti agentie: "
                + (agentie.getClientiCumparatori().size() + agentie.getClientiVanzatori().size()), 2); 
            listaAgentie.setElementAt("Numar locuinte agentie: "
                + (agentie.getLocuinte().size() + agentie.getLocuinteInchiriate().size()), 3);
            //final refresh
            
            adaugaClientLocuintaDialogBox.dispose();
        } catch (IllegalArgumentException e) {
            JOptionPane.showMessageDialog(this, e.getMessage(),
                "Eroare", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_butonOkAdaugaClientLocuintaActionPerformed

    private void butonCancelAdaugaClientLocuintaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butonCancelAdaugaClientLocuintaActionPerformed
        int alegere = JOptionPane.showConfirmDialog(null, "Modificarile facute nu vor fi salvate. Esti sigur ca vrei sa iesi ?", "EXIT",
                JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if (alegere == JOptionPane.YES_OPTION) {
            adaugaClientLocuintaDialogBox.dispose();
        }       
    }//GEN-LAST:event_butonCancelAdaugaClientLocuintaActionPerformed

    private void butonAdaugaClientCumparatorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butonAdaugaClientCumparatorActionPerformed
        adaugaClientCumparatorDialogBox.pack();
        adaugaClientCumparatorDialogBox.setVisible(true);
    }//GEN-LAST:event_butonAdaugaClientCumparatorActionPerformed

    private void butonAdaugaClientVanzatorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butonAdaugaClientVanzatorActionPerformed
        adaugaClientLocuintaDialogBox.pack();
        adaugaClientLocuintaDialogBox.setVisible(true);
    }//GEN-LAST:event_butonAdaugaClientVanzatorActionPerformed

    private void butonOkAdaugaClientCumparatorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butonOkAdaugaClientCumparatorActionPerformed
        String nume = null;
        int varsta = 0;
        double buget = 0;
        
        try {
            nume = textFieldNumeClientCumparator.getText();
        } catch(NullPointerException e) {
            JOptionPane.showMessageDialog(this, "Introdu numele!",
                "Eroare", JOptionPane.ERROR_MESSAGE);
        }
        try {       
            varsta = Integer.valueOf(textFieldVarstaClientCumparator.getText());
            buget = Double.valueOf(textFieldBugetClientCumparator.getText());

            ClientCumparator clientCumparator = new ClientCumparator(nume, varsta, buget);
            listaClienti.addElement(clientCumparator);
            
            agentie.adaugaClientCumparator(clientCumparator);
            
            //refresh lista agentie
            listaAgentie.setElementAt("Numar clieniti agentie: "
                + (agentie.getClientiCumparatori().size() + agentie.getClientiVanzatori().size()), 2);
            //final refresh
            
            adaugaClientCumparatorDialogBox.dispose();
        } catch (IllegalArgumentException e) {
            JOptionPane.showMessageDialog(this, e.getMessage(),
                "Eroare", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_butonOkAdaugaClientCumparatorActionPerformed

    private void butonExitFereastraAdaugaClientCumparatorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butonExitFereastraAdaugaClientCumparatorActionPerformed
        adaugaClientCumparatorDialogBox.dispose();
    }//GEN-LAST:event_butonExitFereastraAdaugaClientCumparatorActionPerformed

    private void butonCancelAdaugaClientCumparatorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butonCancelAdaugaClientCumparatorActionPerformed
        int alegere = JOptionPane.showConfirmDialog(null, "Modificarile facute nu vor fi salvate. Esti sigur ca vrei sa iesi ?", "EXIT",
                JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if (alegere == JOptionPane.YES_OPTION) {
            adaugaClientCumparatorDialogBox.dispose();
        }
    }//GEN-LAST:event_butonCancelAdaugaClientCumparatorActionPerformed

    private void butonInchiriazaLocuintaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butonInchiriazaLocuintaActionPerformed
        int index = 0;
        Persoana p = null;
        try{
            index = listaInformatiiClienti.getSelectedIndex();
            p = (Persoana) listaClienti.getElementAt(index);
        } catch (ArrayIndexOutOfBoundsException e){
            JOptionPane.showMessageDialog(this, "Selecteaza un client!",
                "Selecteaza", JOptionPane.WARNING_MESSAGE);
        }
        try{
            if(!p.getStatut().equals("cumparator")) {
                JOptionPane.showMessageDialog(this, "Clientul vanzator nu poate inchiria locuinta!",
                    "Eroare", JOptionPane.ERROR_MESSAGE);
            } else {

            }
        } catch (NullPointerException e) {

        }
    }//GEN-LAST:event_butonInchiriazaLocuintaActionPerformed

    public void populareTest() {
        Locuinta locuinta1 = new Locuinta(50, 3, "Strada Buzasti, nr. 68", 20000, 150);
        Locuinta locuinta2 = new Locuinta(43, 2, "Vasile Alecsandri, nr. 69", 15000, 110);
        Locuinta locuinta3 = new Locuinta(63, 3, "Splaiul Independentei, nr. 290", 30000, 180);

        ClientCumparator clientCumparator1 = new ClientCumparator("Ion", 35, 25000);
        ClientCumparator clientCumparator2 = new ClientCumparator("Alina", 30, 30000);
        ClientCumparator clientCumparator3 = new ClientCumparator("Marius", 40, 10000);

        ClientVanzator clientVanzator1 = new ClientVanzator("Marin", 40, locuinta1);

        AgentVanzari agent1 = new AgentVanzari("Andreea", 31);

        ServiciuCumparator cumparare = new ServiciuCumparator(agent1, agentie);
        ServiciuVanzator vanzare = new ServiciuVanzator(agent1, agentie);

        agentie.adaugaClientCumparator(clientCumparator1);
        agentie.adaugaClientCumparator(clientCumparator2);
        agentie.adaugaClientCumparator(clientCumparator3);

        agentie.adaugaClientVanzator(clientVanzator1);

        agentie.adaugaLocuinta(locuinta2);
        agentie.adaugaLocuinta(locuinta3);
    }

    public void iesire() {
        int alegere = JOptionPane.showConfirmDialog(null, "Esti sigur ca vrei sa iesi din aplicatie ?", "EXIT",
                JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if (alegere == JOptionPane.YES_OPTION) {
            System.exit(0);
        }
    }

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Gui().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDialog adaugaClientCumparatorDialogBox;
    private javax.swing.JDialog adaugaClientLocuintaDialogBox;
    private javax.swing.JButton butonAdaugaClientCumparator;
    private javax.swing.JButton butonAdaugaClientVanzator;
    private javax.swing.JButton butonAfisareAgentiVanzari;
    private javax.swing.JButton butonAfisareClienti;
    private javax.swing.JButton butonAfisareLocuinte;
    private javax.swing.JButton butonCancelAdaugaClientCumparator;
    private javax.swing.JButton butonCancelAdaugaClientLocuinta;
    private javax.swing.JButton butonCumparaLocuinta;
    private javax.swing.JButton butonExit;
    private javax.swing.JButton butonExitFereastraAdaugaClientCumparator;
    private javax.swing.JButton butonExitFereastraAdaugaClientLocuinta;
    private javax.swing.JButton butonExitFereastraClienti;
    private javax.swing.JButton butonExitFereastraLocuinte;
    private javax.swing.JButton butonInchiriazaLocuinta;
    private javax.swing.JButton butonOkAdaugaClientCumparator;
    private javax.swing.JButton butonOkAdaugaClientLocuinta;
    private javax.swing.JButton butonSchimbaBugetAgentie;
    private javax.swing.JButton butonSchimbaNumeAgentie;
    private javax.swing.JDialog clientiDialoxBox;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel labelAdresa;
    private javax.swing.JLabel labelAdresaAgentie;
    private javax.swing.JLabel labelBugetAgentie;
    private javax.swing.JLabel labelBugetClientCumparator;
    private javax.swing.JLabel labelBugetEUR;
    private javax.swing.JLabel labelClienCumparator;
    private javax.swing.JLabel labelClientVanzator;
    private javax.swing.JLabel labelInfoClienti;
    private javax.swing.JLabel labelLocuinta;
    private javax.swing.JLabel labelNumarCamere;
    private javax.swing.JLabel labelNumeAgentie;
    private javax.swing.JLabel labelNumeClient;
    private javax.swing.JLabel labelNumeClientCumparator;
    private javax.swing.JLabel labelPretInchiriere;
    private javax.swing.JLabel labelPretInchiriereEUR;
    private javax.swing.JLabel labelPretVanzare;
    private javax.swing.JLabel labelPretVanzareEUR;
    private javax.swing.JLabel labelStructuraLista;
    private javax.swing.JLabel labelSuprafata;
    private javax.swing.JLabel labelSuprafataMp;
    private javax.swing.JLabel labelVarstaAni;
    private javax.swing.JLabel labelVarstaAni1;
    private javax.swing.JLabel labelVarstaClient;
    private javax.swing.JLabel labelVarstaClientCumparator;
    private javax.swing.JList<String> listaInformatiiAgentie;
    private javax.swing.JList<String> listaInformatiiClienti;
    private javax.swing.JList<String> listaInformatiiLocuinte;
    private javax.swing.JDialog locuinteDialoxBox;
    private javax.swing.JPanel panelButoane;
    private javax.swing.JPanel panelInformatiiAgentie;
    private javax.swing.JTextField textFieldAdresa;
    private javax.swing.JTextField textFieldBugetClientCumparator;
    private javax.swing.JTextField textFieldNrCamere;
    private javax.swing.JTextField textFieldNume;
    private javax.swing.JTextField textFieldNumeClientCumparator;
    private javax.swing.JTextField textFieldPretInchiriere;
    private javax.swing.JTextField textFieldPretVanzare;
    private javax.swing.JTextField textFieldSuprafata;
    private javax.swing.JTextField textFieldVarsta;
    private javax.swing.JTextField textFieldVarstaClientCumparator;
    private javax.swing.JButton vindeLocuinta;
    // End of variables declaration//GEN-END:variables
}
