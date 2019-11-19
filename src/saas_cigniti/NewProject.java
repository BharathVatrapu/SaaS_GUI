/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package saas_cigniti;

/**
 *
 * @author vijju
 */
public class NewProject extends javax.swing.JPanel {

    /**
     * Creates new form CreateProject
     */
    public NewProject() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txtNewProject = new javax.swing.JLabel();
        txtEnterProjectInfo = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        txtName = new javax.swing.JLabel();
        inputProjectName = new javax.swing.JTextField();
        txtType = new javax.swing.JLabel();
        rbWeb = new javax.swing.JRadioButton();
        rbMobile = new javax.swing.JRadioButton();
        rbAPI = new javax.swing.JRadioButton();
        txtBuildTool = new javax.swing.JLabel();
        cmbBuildTool = new javax.swing.JComboBox();
        txtProject = new javax.swing.JLabel();
        cmbProject = new javax.swing.JComboBox();
        txtTestData = new javax.swing.JLabel();
        cmbTestData = new javax.swing.JComboBox();
        cmbReports = new javax.swing.JComboBox();
        txtReports = new javax.swing.JLabel();
        lnkSetupConfigParam = new javax.swing.JLabel();
        txtDescription = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        inputDescription = new javax.swing.JTextArea();
        btnOk = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 204)));

        txtNewProject.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txtNewProject.setText("New Project");

        txtEnterProjectInfo.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtEnterProjectInfo.setText("Please enter project information");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(txtNewProject))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(txtEnterProjectInfo)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(txtNewProject)
                .addGap(18, 18, 18)
                .addComponent(txtEnterProjectInfo)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 204)));

        txtName.setFont(new java.awt.Font("Gadugi", 0, 14)); // NOI18N
        txtName.setText("Name");

        inputProjectName.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 0, 153)));

        txtType.setFont(new java.awt.Font("Gadugi", 0, 14)); // NOI18N
        txtType.setText("Type");

        rbWeb.setText("Web");

        rbMobile.setText("Mobile");

        rbAPI.setText("API / Web Services");

        txtBuildTool.setFont(new java.awt.Font("Gadugi", 0, 14)); // NOI18N
        txtBuildTool.setText("Build Tool");

        cmbBuildTool.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select Build Tool", "Maven", "Gradle" }));

        txtProject.setFont(new java.awt.Font("Gadugi", 0, 14)); // NOI18N
        txtProject.setText("Project");

        cmbProject.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select Project", "TestNG Tests Project", "BDD Cucumber Test Project", "Data Drivern Tests Project", "TestNG & BDD Cucumber Tests Project" }));

        txtTestData.setFont(new java.awt.Font("Gadugi", 0, 14)); // NOI18N
        txtTestData.setText("Test Data");

        cmbTestData.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select Test Data Type", "MS Excel", "JSON", "XML", "Propertie file" }));

        cmbReports.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select Report Type", "Extent Reports", "Alluri Reports" }));

        txtReports.setFont(new java.awt.Font("Gadugi", 0, 14)); // NOI18N
        txtReports.setText("Reports");

        lnkSetupConfigParam.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lnkSetupConfigParam.setForeground(new java.awt.Color(0, 0, 204));
        lnkSetupConfigParam.setText("Setup Project based params");

        txtDescription.setFont(new java.awt.Font("Gadugi", 0, 14)); // NOI18N
        txtDescription.setText("Description");

        inputDescription.setColumns(20);
        inputDescription.setRows(5);
        jScrollPane1.setViewportView(inputDescription);

        btnOk.setText("OK");

        btnCancel.setText("Cancel");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(txtDescription)
                        .addGap(27, 27, 27)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 349, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lnkSetupConfigParam)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtName)
                            .addComponent(txtType)
                            .addComponent(txtBuildTool)
                            .addComponent(txtProject)
                            .addComponent(txtTestData))
                        .addGap(33, 33, 33)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(rbWeb)
                                .addGap(45, 45, 45)
                                .addComponent(rbMobile)
                                .addGap(56, 56, 56)
                                .addComponent(rbAPI))
                            .addComponent(inputProjectName, javax.swing.GroupLayout.PREFERRED_SIZE, 467, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmbBuildTool, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cmbTestData, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cmbProject, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(38, 38, 38)
                                .addComponent(txtReports)
                                .addGap(44, 44, 44)
                                .addComponent(cmbReports, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(19, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnOk, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47)
                .addComponent(btnCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(68, 68, 68))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtName)
                    .addComponent(inputProjectName, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtType)
                    .addComponent(rbWeb)
                    .addComponent(rbMobile)
                    .addComponent(rbAPI))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtBuildTool)
                    .addComponent(cmbBuildTool, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtProject)
                    .addComponent(cmbProject, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTestData)
                    .addComponent(cmbTestData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtReports)
                    .addComponent(cmbReports, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addComponent(lnkSetupConfigParam)
                .addGap(26, 26, 26)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtDescription)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnOk, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(101, 101, 101)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(91, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnOk;
    private javax.swing.JComboBox cmbBuildTool;
    private javax.swing.JComboBox cmbProject;
    private javax.swing.JComboBox cmbReports;
    private javax.swing.JComboBox cmbTestData;
    private javax.swing.JTextArea inputDescription;
    private javax.swing.JTextField inputProjectName;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lnkSetupConfigParam;
    private javax.swing.JRadioButton rbAPI;
    private javax.swing.JRadioButton rbMobile;
    private javax.swing.JRadioButton rbWeb;
    private javax.swing.JLabel txtBuildTool;
    private javax.swing.JLabel txtDescription;
    private javax.swing.JLabel txtEnterProjectInfo;
    private javax.swing.JLabel txtName;
    private javax.swing.JLabel txtNewProject;
    private javax.swing.JLabel txtProject;
    private javax.swing.JLabel txtReports;
    private javax.swing.JLabel txtTestData;
    private javax.swing.JLabel txtType;
    // End of variables declaration//GEN-END:variables
}
