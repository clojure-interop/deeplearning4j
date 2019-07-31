(ns org.deeplearning4j.ui.exception.GenericExceptionMapper
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.ui.exception GenericExceptionMapper]))

(defn ->generic-exception-mapper
  "Constructor."
  (^GenericExceptionMapper []
    (new GenericExceptionMapper )))

(defn to-response
  "ex - `java.lang.Throwable`

  returns: `javax.ws.rs.core.Response`"
  (^javax.ws.rs.core.Response [^GenericExceptionMapper this ^java.lang.Throwable ex]
    (-> this (.toResponse ex))))

