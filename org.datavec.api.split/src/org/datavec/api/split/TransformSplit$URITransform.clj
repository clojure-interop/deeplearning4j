(ns org.datavec.api.split.TransformSplit$URITransform
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.api.split TransformSplit$URITransform]))

(defn apply
  "uri - `java.net.URI`

  returns: `java.net.URI`

  throws: java.net.URISyntaxException"
  (^java.net.URI [^TransformSplit$URITransform this ^java.net.URI uri]
    (-> this (.apply uri))))

