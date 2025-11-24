/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Programa;

import java.awt.Component;
import java.awt.font.TextAttribute;
import java.util.Map;
import javax.swing.DefaultListCellRenderer;
import javax.swing.JLabel;
import javax.swing.JList;

/**
 *
 * @author aucor
 */
class TareaRenderer extends DefaultListCellRenderer {
    @Override
    public Component getListCellRendererComponent(JList list, Object value, int index,
                                                  boolean isSelected, boolean cellHasFocus) {
        
        JLabel label = (JLabel) super.getListCellRendererComponent(list, value, index, isSelected, cellHasFocus);

        String texto = value.toString();

        if (texto.startsWith("✔")) {
            Map atributos = label.getFont().getAttributes();
            atributos.put(TextAttribute.STRIKETHROUGH, TextAttribute.STRIKETHROUGH_ON);
            label.setFont(label.getFont().deriveFont(atributos));
        } else {
            Map atributos = label.getFont().getAttributes();
            atributos.put(TextAttribute.STRIKETHROUGH, false);
            label.setFont(label.getFont().deriveFont(atributos));
        }

        return label;
    }
    
}

