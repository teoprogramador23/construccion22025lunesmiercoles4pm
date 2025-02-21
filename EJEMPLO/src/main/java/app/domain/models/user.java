/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package app.domain.models;
import lombok.Getter;
import lombok.NoArgsConstruction;
import lombok.Setter;
/**
 *
 * @author Mat3o
 */
@Setter
@Getter
@NoArgsConstructor
public class user extends person {
    private long id;
    private String username;
    private String password;
    private String role;
}
