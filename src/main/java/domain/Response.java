package domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.experimental.FieldDefaults;

@Builder
@ToString
@Getter
@NoArgsConstructor(force = true)
@AllArgsConstructor
@FieldDefaults(makeFinal = true, level = AccessLevel.PRIVATE)
@JsonIgnoreProperties(ignoreUnknown = true)
public class Response {
    String data;
    String origin;
    String url;
}
