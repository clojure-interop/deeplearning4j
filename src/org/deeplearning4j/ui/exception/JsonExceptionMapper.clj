(ns org.deeplearning4j.ui.exception.JsonExceptionMapper
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.ui.exception JsonExceptionMapper]))

(defn ->json-exception-mapper
  "Constructor."
  (^JsonExceptionMapper []
    (new JsonExceptionMapper )))

(defn to-response
  "exception - `com.fasterxml.jackson.core.JsonProcessingException`

  returns: `javax.ws.rs.core.Response`"
  (^javax.ws.rs.core.Response [^JsonExceptionMapper this ^com.fasterxml.jackson.core.JsonProcessingException exception]
    (-> this (.toResponse exception))))

