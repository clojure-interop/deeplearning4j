(ns org.nd4j.linalg.util.JarResource
  "This is untested copy from Canova ClassPathResource"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.util JarResource]))

(defn ->jar-resource
  "Constructor.

  Builds new ClassPathResource object

  resource-name - String name of resource, to be retrieved - `java.lang.String`"
  (^JarResource [^java.lang.String resource-name]
    (new JarResource resource-name)))

(defn get-file
  "Returns requested ClassPathResource as File object
  Please note: if this method called from compiled jar, temporary file will be created to provide File access

  returns: File requested at constructor call - `java.io.File`

  throws: java.io.FileNotFoundException"
  (^java.io.File [^JarResource this]
    (-> this (.getFile))))

(defn get-input-stream
  "Returns requested ClassPathResource as InputStream object

  returns: File requested at constructor call - `java.io.InputStream`

  throws: java.io.FileNotFoundException"
  (^java.io.InputStream [^JarResource this]
    (-> this (.getInputStream))))

