package co.com.sofka.questions.usecases;

import co.com.sofka.questions.collections.Question;
import co.com.sofka.questions.model.QuestionDTO;
import co.com.sofka.questions.reposioties.QuestionRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.boot.test.mock.mockito.SpyBean;
import reactor.core.publisher.Flux;

import java.util.Arrays;

@SpringBootTest
class OwnerListUseCaseTest {

    @MockBean
    QuestionRepository questionRepository;

    @SpyBean
    OwnerListUseCase ownerListUseCase;

    @Test
    void ownerListTest(){
        var resourceDT0 = new QuestionDTO("xxx", "yyy", "Que es Java?", "tecnologia",
                "TECNOLOGIA", 1, 2, Arrays.asList("xxx1", "xxx2"), "daniela.03v@gmail.com");

        var resource = new Question();
        resource.setId("xxx");
        resource.setUserId("yyy");
        resource.setQuestion("Que es Java?");
        resource.setType("tecnologia");
        resource.setCategory("TECNOLOGIA");
        resource.setNumberOfReviews(1);
        resource.setSumOfReviewScores(1);
        resource.setUserReviews(Arrays.asList("xxx1", "xxx2"));
        resource.setUserEmail("daniela.03v@gmail.com");

        Mockito.when(questionRepository.findByUserId(resourceDT0.getUserId())).thenReturn(Flux.just(resource));

        var resultQuestionDTO =  ownerListUseCase.apply(resourceDT0.getUserId()).collectList().block();

        assert resultQuestionDTO != null;
        Assertions.assertEquals(resultQuestionDTO.get(0).getId(), resource.getId());
        Assertions.assertEquals(resultQuestionDTO.get(0).getUserId(), resource.getUserId());
        Assertions.assertEquals(resultQuestionDTO.get(0).getQuestion(), resource.getQuestion());
        Assertions.assertEquals(resultQuestionDTO.get(0).getType(), resource.getType());
        Assertions.assertEquals(resultQuestionDTO.get(0).getCategory(), resource.getCategory());
    }
}

