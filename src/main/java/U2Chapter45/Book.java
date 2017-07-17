package U2Chapter45;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by vov on 09.06.2017.
 */

    @Entity
    public class Book {
    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="course_seq")
    @SequenceGenerator(
            name="course_seq",
            sequenceName="tmp_seqbook",
            allocationSize = 1,
            initialValue = 1
    )
    private Long id;
    public String title;
    private Float price;
    private String description;
    private String isbn;
    private Integer nbOfPage;
    private Boolean illustrations;
    @ElementCollection(fetch = FetchType.LAZY)
    @CollectionTable(name = "Tag")
    @Column(name = "Value")
    public List<String> tags = new ArrayList<>();


// Конструкторы, геттеры, сеттеры

}