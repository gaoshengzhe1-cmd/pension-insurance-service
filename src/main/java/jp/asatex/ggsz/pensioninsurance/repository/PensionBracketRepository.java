package jp.asatex.ggsz.pensioninsurance.repository;

import jp.asatex.ggsz.pensioninsurance.entity.PensionBracket;
import reactor.core.publisher.Mono;

public interface PensionBracketRepository {
    Mono<PensionBracket> findBracketByAmount(Integer amount);
}
