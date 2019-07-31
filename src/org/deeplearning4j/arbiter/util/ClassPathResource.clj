(ns org.deeplearning4j.arbiter.util.ClassPathResource
  "Simple utility class used to get access to files at the classpath, or packed into jar.
 Based on Spring ClassPathResource implementation  jar internals access implemented."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.arbiter.util ClassPathResource]))

(defn ->class-path-resource
  "Constructor.

  Builds new ClassPathResource object

  resource-name - String name of resource, to be retrieved - `java.lang.String`"
  (^ClassPathResource [^java.lang.String resource-name]
    (new ClassPathResource resource-name)))

(defn get-file
  "Returns requested ClassPathResource as File object
  Please note: if this method called from compiled jar, temporary file will be created to provide File access

  returns: File requested at constructor call - `java.io.File`

  throws: java.io.FileNotFoundException"
  (^java.io.File [^ClassPathResource this]
    (-> this (.getFile))))

(defn get-input-stream
  "Returns requested ClassPathResource as InputStream object

  returns: File requested at constructor call - `java.io.InputStream`

  throws: java.io.FileNotFoundException"
  (^java.io.InputStream [^ClassPathResource this]
    (-> this (.getInputStream))))

