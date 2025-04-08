//package com.zidi.flowerbackenddemo.entity;
//
//import jakarta.persistence.*;
//import lombok.Data;
//
//@Entity
//@Table(name="flower_description", schema = "flower_demo")
//public class FlowerDescription {
//    @Id @GeneratedValue
//    public Long id;
//
//    public String imageName;
//    public String color;
//    public String petals;
//    public String smell;
//    public String location;
//
//    @ManyToOne
//    public User user; // assumes you have a User entity with email
//
//    @OneToOne
//    @JoinColumn(name ="result_id")
//    public IdentificationResult result;
//
//    @OneToOne(fetch = FetchType.LAZY)
//    @JoinColumn(name = "result_id")
//    private IdentificationResult identificationResult; // Each flower description now has a corresponding identification result
//}
package com.zidi.flowerbackenddemo.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name="flower_description", schema = "flower_demo")
@Data
public class FlowerDescription {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String imageName;
    private String color;
    private String petals;
    private String smell;
    private String location;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    private User user; // Each description of flower now has each corresponding user account
//    @OneToOne
//    @JoinColumn(name ="result_id")
//    public IdentificationResult result;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "result_id")
    private IdentificationResult identificationResult; // Each flower description now has a corresponding identification result
}