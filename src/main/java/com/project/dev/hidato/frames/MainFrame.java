/*
 * @fileoverview    {MainFrame} se encarga de realizar tareas específicas.
 *
 * @version         2.0
 *
 * @author          Dyson Arley Parra Tilano <dysontilano@gmail.com>
 *
 * @copyright       Dyson Parra
 * @see             github.com/DysonParra
 *
 * History
 * @version 1.0     Implementación realizada.
 * @version 2.0     Documentación agregada.
 */
package com.project.dev.hidato.frames;

import com.project.dev.Application;
import com.project.dev.hidato.code.Tablero;
import com.project.dev.hidato.code.Txt;
import com.project.dev.hidato.code.Validator;
import java.awt.Component;
import java.awt.HeadlessException;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

import static javax.swing.JTable.AUTO_RESIZE_OFF;

/**
 * TODO: Definición de {@code MainFrame}.
 *
 * @author Dyson Parra
 * @since 1.8
 */
public class MainFrame extends javax.swing.JFrame {

    /**
     * FIXME: Definición de {@code getScreenShot}. Crea un BufferedImage que captura Main_Frame como
     * imagen.
     *
     * @param component
     * @return
     */
    public static BufferedImage getScreenShot(Component component) {
        // A BufferedImage le asigna una captura de imagen del componente parámetro.
        BufferedImage image = new BufferedImage(component.getWidth(), component.getHeight(), BufferedImage.TYPE_INT_RGB);

        // Pinta el componente como image Graphics.
        component.paint(image.getGraphics());

        // Devuelve la imagen.
        return image;
    }

    /**
     * TODO: Definición de {@code getSaveSnapShot}.
     *
     * @param component
     * @param fileName
     * @throws java.lang.Exception
     */
    public static void getSaveSnapShot(Component component, String fileName) throws Exception {
        // A BufferedImage le asigna una captura del componente parámetro.
        BufferedImage img = getScreenShot(component);

        // Guarda la imagen capturada como .PNG en la ruta filename.
        ImageIO.write(img, "png", new File(fileName));
    }

    /**
     * TODO: Definición de {@code Main_Frame}.
     *
     */
    public MainFrame() {
        initComponents();

        // Pone título a la ventana.
        this.setTitle("HIDATO");
    }

    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT
     * modify this code. The content of this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuBar1 = new javax.swing.JMenuBar();
        file_Menu = new javax.swing.JMenu();
        neu = new javax.swing.JMenuItem();
        load_Menu = new javax.swing.JMenuItem();
        restart_Menu = new javax.swing.JMenuItem();
        solve_Menu = new javax.swing.JMenuItem();
        delete_Menu = new javax.swing.JMenuItem();
        exit = new javax.swing.JMenuItem();
        export_Menu = new javax.swing.JMenu();
        img = new javax.swing.JMenuItem();
        txt = new javax.swing.JMenuItem();
        help_Menu = new javax.swing.JMenu();
        help = new javax.swing.JMenuItem();
        level = new javax.swing.JMenuItem();
        generator = new javax.swing.JMenuItem();
        cost = new javax.swing.JMenuItem();
        Dead_Point = new javax.swing.JMenuItem();

        jMenuItem1.setText("jMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        file_Menu.setText("Hidato");

        neu.setText("Nuevo Hidato");
        neu.addActionListener(this::neuActionPerformed);
        file_Menu.add(neu);

        load_Menu.setText("Cargar Hidato");
        load_Menu.addActionListener(this::load_MenuActionPerformed);
        file_Menu.add(load_Menu);

        restart_Menu.setText("Reiniciar Hidato");
        restart_Menu.addActionListener(this::restart_MenuActionPerformed);
        file_Menu.add(restart_Menu);

        solve_Menu.setText("Ver Solución");
        solve_Menu.addActionListener(this::solve_MenuActionPerformed);
        file_Menu.add(solve_Menu);

        delete_Menu.setText("Eliminar Hidato");
        delete_Menu.addActionListener(this::delete_MenuActionPerformed);
        file_Menu.add(delete_Menu);

        exit.setText("Salir");
        exit.setToolTipText("");
        exit.addActionListener(this::exitActionPerformed);
        file_Menu.add(exit);

        jMenuBar1.add(file_Menu);

        export_Menu.setText("Exportar");

        img.setText("Imagen");
        img.addActionListener(this::imgActionPerformed);
        export_Menu.add(img);

        txt.setText("Texto");
        txt.setToolTipText("");
        txt.addActionListener(this::txtActionPerformed);
        export_Menu.add(txt);

        jMenuBar1.add(export_Menu);

        help_Menu.setText("Ayuda");

        help.setText("Acerca de");
        help.addActionListener(this::helpActionPerformed);
        help_Menu.add(help);

        level.setText("Nivel");
        level.addActionListener(this::levelActionPerformed);
        help_Menu.add(level);

        generator.setText("Generador");
        generator.addActionListener(this::generatorActionPerformed);
        help_Menu.add(generator);

        cost.setText("Costos");
        cost.addActionListener(this::costActionPerformed);
        help_Menu.add(cost);

        Dead_Point.setText("Punto muerto");
        Dead_Point.addActionListener(this::Dead_PointActionPerformed);
        help_Menu.add(Dead_Point);

        jMenuBar1.add(help_Menu);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 320, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 219, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * TODO: Definición de {@code neuActionPerformed}.
     *
     * @param evt
     */
    private void neuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_neuActionPerformed
        // Crea una instancia de NewFrame.
        JFrame newFrame = new NewFrame();

        // Pone visible la instancia.
        newFrame.setVisible(true);
    }//GEN-LAST:event_neuActionPerformed

    /**
     * TODO: Definición de {@code exitActionPerformed}.
     *
     * @param evt
     */
    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
        // Sale del programa.
        System.exit(0);
    }//GEN-LAST:event_exitActionPerformed

    /**
     * TODO: Definición de {@code imgActionPerformed}.
     *
     * @param evt
     */
    private void imgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_imgActionPerformed
        // Evalúa si cantRows es cero (No hay hidato creado).
        if (Application.cantRows == 0) {
            // Escribe que primero cree o carge un Application.
            JOptionPane.showMessageDialog(null, "Cree o carge un Hidato primero");
        } // Si hay algún hidato en pantalla.
        else {
            // Crea una ventana para ingresar la ruta, con una ruta sugerida.
            Application.ruta = JOptionPane.showInputDialog(null, "Ingrese la ruta: ", Application.defaultLocation + ".png");

            // Evalúa si no se dejó la ruta en blanco o se dió en cancelar.
            if (Application.ruta != null) {
                // Intenta abrir la imagen para ver si existe.
                try {
                    // Crea un buefferedImage con la ruta ingresada.
                    BufferedImage imagen = ImageIO.read(new File(Application.ruta));

                    // Si pudo cargar la imagen escribe que la imagen ya existe.
                    JOptionPane.showMessageDialog(null, "No se pudo guardar la imagen\nporque la imagen ya existe\nIntente con otro nombre");
                } // Si no pudo cargar la imagen en la ruta escrita (Ruta inválida ó imagen inexistente) procede a intentar guardarla. // Si no pudo cargar la imagen en la ruta escrita (Ruta inválida ó imagen inexistente) procede a intentar guardarla.
                catch (HeadlessException | IOException e) {
                    // Crea instancia de Validator.
                    Validator val = new Validator();
                    // Evalúa si la ruta escrita no tiene algún slash.
                    if (val.validarSlash(Application.ruta) == false) {
                        try {
                            // Se guarda por defecto en la carpeta del proyecto con el nombre escrito en la ruta.
                            getSaveSnapShot(Application.Table, Application.ruta);
                            // Escribe que se guardo con exito.
                            JOptionPane.showMessageDialog(null, "Se ha exportado como imagen en la carpeta del proyecto" + "\n" + "con nombre " + Application.ruta);
                        } // Por acá no va a entrar, pero cada vez que se intenta guardar un snapshot se necesita obligatoriamente un try-catch. // Por acá no va a entrar, pero cada vez que se intenta guardar un snapshot se necesita obligatoriamente un try-catch.
                        catch (Exception ex) {
                            Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
                        }
                        Application.ruta = null;
                    } // Si a ruta tiene algún slash.
                    else {
                        // Inteta guardar la imagen.
                        try {
                            // Guarda la imagen en la ruta.
                            getSaveSnapShot(Application.Table, Application.ruta);

                            // Escribe que se guardó con exito y donde se guardó.
                            JOptionPane.showMessageDialog(null, "Se ha exportado como imagen en" + "\n" + Application.ruta);
                        } // Si la ruta tiene algún Slash, pero no existe tal ruta. // Si la ruta tiene algún Slash, pero no existe tal ruta.
                        catch (Exception ex) {
                            // Atrapa la exception.
                            Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);

                            // Escribe que la ruta no es válida.
                            JOptionPane.showMessageDialog(null, "Escriba una ruta válida");
                        }

                        // Reinicia la ruta.
                        Application.ruta = null;
                    }
                }
            }
        }
    }//GEN-LAST:event_imgActionPerformed

    /**
     * TODO: Definición de {@code txtActionPerformed}.
     *
     * @param evt
     */
    private void txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtActionPerformed
        // Evalúa si cantRows es cero (No hay hidato creado).
        if (Application.cantRows == 0) {
            // Escribe que primero cree o carge un Application.
            JOptionPane.showMessageDialog(null, "Cree o carge un Hidato primero");
        } // Si hay algún hidato en pantalla.
        else {
            // Crea una ventana para ingresar la ruta, con una ruta sugerida.
            Application.ruta = JOptionPane.showInputDialog(null, "Ingrese la ruta: ", Application.defaultLocation + ".txt");

            // Si no se dejó la ruta en blanco, ó se dió en cancelar.
            if (Application.ruta != null) {
                // Crea una instancia de tablero.
                Tablero tablero = new Tablero();

                // Crea una instancia de Txt.
                Txt text;
                text = new Txt();

                // crea una instancia de validator.
                Validator val = new Validator();

                // A slash le asigna si la ruta ingresada tiene algún slash.
                boolean slash = val.validarSlash(Application.ruta);

                // Almacena el hidato en pantalla en una matrix.
                int[][] matrix = tablero.jTableToMatrix(Application.Table);

                // Guarda el Application en un archivo .txt.
                text.saveHidatoToTxt(Application.ruta, matrix, slash);

                // Reinicia la ruta.
                Application.ruta = "";
            }
        }
    }//GEN-LAST:event_txtActionPerformed

    /**
     * TODO: Definición de {@code solve_MenuActionPerformed}.
     *
     * @param evt
     */
    private void solve_MenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_solve_MenuActionPerformed
        // Evalúa si cantRows es cero (No hay hidato creado).
        if (Application.cantRows == 0) {
            // Escribe que primero cree o carge un Application.
            JOptionPane.showMessageDialog(null, "Cree o carge un Hidato primero");
        } // Evalúa si el Application cargado es un hidato completo (solucionado).
        else if (Application.cantPistas == Application.cantCols * Application.cantRows) {
            // Escribe que no hay necesidad de buscar una solución.
            JOptionPane.showMessageDialog(null, "El hidato en pantalla ya está solucionado");
        } // Si hay algún hidato en pantalla.
        else {
            // breath definirá si se dió en buscar solución a fondo o no.
            boolean breath = true;

            // Pregunta si desea mostar la solución del hidato.
            int ax = JOptionPane.showConfirmDialog(null, "Está seguro que desea Mostar la solución");

            // En caso de dar ques si.
            if (ax == JOptionPane.YES_OPTION) {
                // Crea instancia de Tablero.
                Tablero tablero = new Tablero();

                // Evalúa si el hidato en pantalla ya tiene su solución, o no.
                switch (Application.loadOrNew) {

                    // Si el Application fué cargado y no se le ha hallado la solución.
                    case 2:
                        JOptionPane.showMessageDialog(null, "Se buscará una solución rápida");
                        Application.matrix_Complete = tablero.fastSolveHidato(Application.matrix_Complete);
                        //Hidato.loadOrNew = 3;

                        // Si no halló solución.
                        if (Application.loadOrNew == 3) {
                            // Pregunta si desea intentar con una solución a fondo.
                            int aux = JOptionPane.showConfirmDialog(null, "No se pudo encontrar una solución rápida.\n¿desea intentar con una solución a fondo?\n¡Es posible que tarde demasiado\ndependiendo del tamaño del hidato!");

                            // En caso de dar ques si.
                            if (aux == JOptionPane.YES_OPTION) {
                                //JOptionPane.showMessageDialog(null,"Se buscará una solución a fondo");
                                int vect[] = new int[4];                        // Crea vector que tendrá la fila, columna, y valor actual a escribir del hidato.
                                vect[0] = Application.firstPos[0];                   // A vect en la posición 1 le asigna la fila del Application cargado que contiene el valor 1.
                                vect[1] = Application.firstPos[1];                   // A vect en la posición 2 le asigna la columna del Application cargado que contiene el valor 1.
                                vect[2] = 1;                                    // A vect en la posición 2 le asigna el valor desde el cual iniciará el hidato.

                                // calcula el tiempo cuando se comenzó a resolver el hidato.
                                long tiempoInicio = System.currentTimeMillis();

                                tablero.slowSolveHidato(Application.matrix_Complete, vect);

                                // Calcula el tiempo trancurrido solucionando el hidato.
                                long totalTiempo = System.currentTimeMillis() - tiempoInicio;
                                System.out.println("Total time solving the hidato is " + totalTiempo / 1000.0 + " seconds");

                                if (Application.loadOrNew == 1) {
                                    // A jsCrollPane1 le lleva matrix_With_level almacenada en un JTable y pintada, usando matrixToJTable.
                                    Application.jScrollPane1 = tablero.matrixToJTable(Application.matrix_Complete, Application.jScrollPane1, Application.Table);
                                } else {
                                    // Indica que no se encontró solución.
                                    JOptionPane.showMessageDialog(null, "El sistema no pudo encontrar una solución para el hidato");
                                }
                            } else {
                                // Como se decidió no buscar una solución a fondo, no se sabe si el hidato posee solución, por tanto se pone loadOrNew en 2 para que se pueda intentar volver a hallarla.
                                Application.loadOrNew = 2;

                                // Se pone breath como alse indicando que no se sabe si hay solución.
                                breath = false;
                            }
                        } // Si halló solución.
                        else {
                            // A jsCrollPane1 le lleva matrix_With_level almacenada en un JTable y pintada, usando matrixToJTable.
                            Application.jScrollPane1 = tablero.matrixToJTable(Application.matrix_Complete, Application.jScrollPane1, Application.Table);
                        }
                        break;
                    // Si el hidato fué creado ó ya se encontró solución a uno cargado.
                    case 1:
                        // Reemplaza el hidato actual con matrix_Complete almacenandola en el mismo JTable.
                        Application.jScrollPane1 = tablero.matrixToJTable(Application.matrix_Complete, Application.jScrollPane1, Application.Table);
                        break;
                    // Si cargó un hidato, no encontró solución a este y está dando en mostrar solución de nuevo.
                    default:
                        JOptionPane.showMessageDialog(null, "El sistema no pudo encontrar una solución para el hidato");
                        break;
                }

                // Si hay solución redimensiona la ventana.
                if (Application.loadOrNew != 3 && breath != false) {
                    // Redimensiona MainFrame, y le pasa "solve" como parámetro para que muestre el mensaje de solución del hidato.
                    tablero.resizeHidato("solve");
                }
            }
        }
    }//GEN-LAST:event_solve_MenuActionPerformed

    /**
     * TODO: Definición de {@code restart_MenuActionPerformed}.
     *
     * @param evt
     */
    private void restart_MenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_restart_MenuActionPerformed
        // Evalúa si cantRows es cero (No hay hidato creado)
        if (Application.cantRows == 0) {
            // Escribe que primero cree o carge un Application.
            JOptionPane.showMessageDialog(null, "Cree o carge un Hidato primero");
        } // Si hay algún hidato en pantalla.
        else {
            // Pregunta si desea reiniciar el hidato.
            int ax = JOptionPane.showConfirmDialog(null, "Está seguro que desea reiniciar el hidato");

            // En caso de dar ques si.
            if (ax == JOptionPane.YES_OPTION) {
                // Crea instancia de Tablero.
                Tablero tablero = new Tablero();

                // Reemplaza el hidato actual con matrix_With_Level almacenandola en el mismo JTable.
                Application.jScrollPane1 = tablero.matrixToJTable(Application.matrix_With_Level, Application.jScrollPane1, Application.Table);

                // Redimensiona MainFrame, y le pasa "restart" como parámetro para que muestre el mensaje de hidato reiniciado.
                tablero.resizeHidato("restart");
            }
        }
    }//GEN-LAST:event_restart_MenuActionPerformed

    /**
     * TODO: Definición de {@code levelActionPerformed}.
     *
     * @param evt
     */
    private void levelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_levelActionPerformed
        JOptionPane.showMessageDialog(null, "Los niveles se asignan así:" + "\nNivel 1: 80% de las casillas son pistas" + "\nNivel 2: 60% de las casillas son pistas" + "\nNivel 3: 50% de las casillas son pistas");
    }//GEN-LAST:event_levelActionPerformed

    /**
     * TODO: Definición de {@code delete_MenuActionPerformed}.
     *
     * @param evt
     */
    private void delete_MenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delete_MenuActionPerformed
        // Evalúa si cantRows es cero (No hay hidato creado).
        if (Application.cantRows == 0) {
            // Escribe que primero cree o carge un Application.
            JOptionPane.showMessageDialog(null, "Cree o carge un Hidato primero");
        } // Si hay algún hidato en pantalla.
        else {
            // Pregunta si desea borrar el hidato.
            int ax = JOptionPane.showConfirmDialog(null, "Está seguro que desea eliminar el hidato");

            // En caso de dar ques si.
            if (ax == JOptionPane.YES_OPTION) {
                // Al JScrollPane en pantalla le pone dimensiones cero.
                Application.jScrollPane1.setBounds(10, 10, 0, 0);

                // LLeva MainFrame a sus dimensiones originales.
                Application.Main_Frame.resize(320, 240);

                // Reinicia cantidad de filas, cantidad de columnas, cantidad de pistas y nivel.
                Application.cantRows = 0;
                Application.cantCols = 0;
                Application.cantPistas = 0;
                Application.level = 0;
                Application.loadOrNew = 0;

                // Dice que se borró el hidato.
                JOptionPane.showMessageDialog(null, "Se ha borrado el hidato");
            }
        }

    }//GEN-LAST:event_delete_MenuActionPerformed

    /**
     * TODO: Definición de {@code generatorActionPerformed}.
     *
     * @param evt
     */
    private void generatorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_generatorActionPerformed
        JOptionPane.showMessageDialog(null, "Los hidatos se generan tomando una posición\naleatoria en el tablero y evaluando a cuales\ncasillas se puede desplazar desde allí.\nLuego evalúa cada una de las casillas posibles a\ncuantas se puede desplazar, y irá desde la inicial a\naquella cuyo número de casilla posibles sea menor.");
    }//GEN-LAST:event_generatorActionPerformed

    /**
     * TODO: Definición de {@code helpActionPerformed}.
     *
     * @param evt
     */
    private void helpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_helpActionPerformed
        JOptionPane.showMessageDialog(null, "Este programa sirve para generar y solucionar hidatos");
    }//GEN-LAST:event_helpActionPerformed

    /**
     * TODO: Definición de {@code load_MenuActionPerformed}.
     *
     * @param evt
     */
    private void load_MenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_load_MenuActionPerformed

        // Crea una ventana para ingresar la ruta, con una ruta sugerida.
        Application.ruta = JOptionPane.showInputDialog(null, "Ingrese la ruta: ", Application.defaultLocation + ".txt");
        //System.out.printf("%s y no",Application.ruta);
        if (Application.ruta != null) {
            // Crea una instancia de tablero.
            Tablero tablero = new Tablero();

            // crea una instancia de validator.
            Validator val = new Validator();

            try {
                // Intenta cargar el "txt".
                val.validarTxt(Application.ruta, "load");

                // A Application.tracks le lleva las posiciones de cada una de las pistas del hidato cargado.
                Application.tracks = tablero.createTracksMatrix(Application.matrix_With_Level);

                // Redimensiona MainFrame, y le pasa "load" como parámetro para que muestre el mensaje de hidato cargado.
                tablero.resizeHidato("load");
            } // Si no pudo cargar el hidato ya sea porque no existe el txt ó porqué no es un txt válido. // Si no pudo cargar el hidato ya sea porque no existe el txt ó porqué no es un txt válido.
            catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "No se pudo cargar el hidato.\nVerifíque que el archivo existe\ny es un hidato válido");     // Indica que no fue posible guardar el ".txt".

            }

            // Reinicia la ruta.
            Application.ruta = null;
        }
    }//GEN-LAST:event_load_MenuActionPerformed

    /**
     * TODO: Definición de {@code costActionPerformed}.
     *
     * @param evt
     */
    private void costActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_costActionPerformed
        Tablero tablero = new Tablero();
        Application.matrix_Help = tablero.fillCostMatrix(Application.matrix_Help, 11);
        Application.jScrollPaneHelp = tablero.matrixToJTable(Application.matrix_Help, Application.jScrollPaneHelp, Application.TableHelp);

        // Agrega el jsCrollPane con el Application a helpFrame.
        Application.helpFrame.add(Application.jScrollPaneHelp);

        // Redimensiona MainFrame con las dimensiones de jScrollPaneHelp más algunos píxeles de margen.
        Application.helpFrame.resize(Application.jScrollPaneHelp.getWidth() + 20, Application.jScrollPaneHelp.getHeight() + 60);

        // Hace que la tabla no se redimensione automáticamente.
        Application.TableHelp.setAutoResizeMode(AUTO_RESIZE_OFF);

        // Hace que helpFrame no se pueda redimensionar.
        Application.helpFrame.setResizable(false);

        // Pone visible helpFrame.
        Application.helpFrame.setVisible(true);

        JOptionPane.showMessageDialog(null, "El costo de ir de la casilla central hacia otra cualquiera\nse calcula restando la fila de la casilla central\ncon la de la otra y llevando el resultado a valor absoluto\n"
                + "luego restando la columna de la casilla central con\nla de la otra y llevando el resultado a valor absoluto\n"
                + "y luego sumando ambos resultados.\n\n"
                + "Por ejemplo moverse una casilla dará un costo entre\n"
                + "1 y 2, moverse dos dará un costo entre 1 y 4, \n"
                + "y moverse tres dará un costo entre 1 y 6");
        Application.helpFrame.dispose();
    }//GEN-LAST:event_costActionPerformed

    /**
     * TODO: Definición de {@code Dead_PointActionPerformed}.
     *
     * @param evt
     */
    private void Dead_PointActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Dead_PointActionPerformed
        Tablero tablero = new Tablero();

        JOptionPane.showMessageDialog(null, "Se define para esta práctica el concepto de punto muerto como\n"
                + "dadas dos casila m y n, la única forma posible de llegar a n\n"
                + "es desde m, y en caso de moverse desde m hasta n, el hidato\n"
                + "se queda sin movimientos");

        Application.matrix_Help = tablero.fillDeadMatrix(Application.matrix_Help, 5, 1);
        Application.jScrollPaneHelp = tablero.matrixToJTable(Application.matrix_Help, Application.jScrollPaneHelp, Application.TableHelp);

        // Agrega el jsCrollPane con el Application a helpFrame.
        Application.helpFrame.add(Application.jScrollPaneHelp);

        // Redimensiona MainFrame con las dimensiones de jScrollPaneHelp más algunos píxeles de margen.
        Application.helpFrame.resize(Application.jScrollPaneHelp.getWidth() + 20, Application.jScrollPaneHelp.getHeight() + 60);

        // Hace que la tabla no se redimensione automáticamente.
        Application.TableHelp.setAutoResizeMode(AUTO_RESIZE_OFF);

        // Pone visible helpFrame.
        Application.helpFrame.setVisible(true);

        JOptionPane.showMessageDialog(null, "En este ejemplo hay un punto muerto, puesto que\n"
                + "la única forma de llegar a la casilla 2,1 es desde 2,2,\n"
                + "y si se va por otro camino a escribir el valor 15, ya\n"
                + "no será posible visitar la casilla 2,1, osea que es\n"
                + "necesario visitarla ahora, en cuyo caso se quedaría\n"
                + "sin movimientos, entonces se concluye que el valor 14\n"
                + "no va en 2,1. Lo mismo si se pusiera 14 en 0,1 (punto\n"
                + "muerto en 0,0), igual si se pusiera 14 en 1,3 ( punto\n"
                + "muerto en 0,4), así descarta 3 caminos rápidamente.");

        Application.matrix_Help = tablero.fillDeadMatrix(Application.matrix_Help, 5, 2);
        Application.jScrollPaneHelp = tablero.matrixToJTable(Application.matrix_Help, Application.jScrollPaneHelp, Application.TableHelp);

        // Agrega el jsCrollPane con el Application a helpFrame.
        Application.helpFrame.add(Application.jScrollPaneHelp);

        // Redimensiona MainFrame con las dimensiones de jScrollPaneHelp más algunos píxeles de margen.
        Application.helpFrame.resize(Application.jScrollPaneHelp.getWidth() + 20, Application.jScrollPaneHelp.getHeight() + 60);

        // Hace que la tabla no se redimensione automáticamente.
        Application.TableHelp.setAutoResizeMode(AUTO_RESIZE_OFF);

        // Pone visible helpFrame.
        Application.helpFrame.setVisible(true);

        JOptionPane.showMessageDialog(null, "En este otro ejemplo parece haber un punto muerto\n"
                + "al poner 15 en 2,2, pero en realidad si se pusiese\n"
                + "el valor 16 en 2,1, ahora podría poner el 17 en 1,1,\n"
                + "entendiendo que este programa resuelve un hidato\n"
                + "poniendo valores, y en caso de encontrar una pista\n"
                + "pone el valor de esta en la solución, y sigue\n"
                + "resolviendo desde ahí, se entiende que todas las\n"
                + "casillas con valores mayores al valor actual son\n"
                + "en realidad pistas en el hidato cargado, y es\n"
                + "necesario visitarlas cuando el valor actual sea\n"
                + "el valor anterior al de la pista.");
        Application.helpFrame.dispose();
    }//GEN-LAST:event_Dead_PointActionPerformed

    /**
     * Entrada principal del sistema.
     *
     * @param args argumentos de la linea de comandos.
     */
    public static void main(String args[]) {
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        java.awt.EventQueue.invokeLater(() -> {
            new MainFrame().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem Dead_Point;
    private javax.swing.JMenuItem cost;
    private javax.swing.JMenuItem delete_Menu;
    private javax.swing.JMenuItem exit;
    private javax.swing.JMenu export_Menu;
    private javax.swing.JMenu file_Menu;
    private javax.swing.JMenuItem generator;
    private javax.swing.JMenuItem help;
    private javax.swing.JMenu help_Menu;
    private javax.swing.JMenuItem img;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem level;
    private javax.swing.JMenuItem load_Menu;
    private javax.swing.JMenuItem neu;
    private javax.swing.JMenuItem restart_Menu;
    private javax.swing.JMenuItem solve_Menu;
    private javax.swing.JMenuItem txt;
    // End of variables declaration//GEN-END:variables
}
