package addressbook;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource(collectionResourceRel = "buddies", path="buddies")
public interface BuddyRepository extends PagingAndSortingRepository<BuddyInfo, Long> {
    List<BuddyInfo> findByName(@Param("name") String name);
}
