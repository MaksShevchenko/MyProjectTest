package petStore.dto;

import java.util.List;

public record Pet(long id, Category category, String name, List<String> photoUrl, List<Tag> tags, String status) {
}
