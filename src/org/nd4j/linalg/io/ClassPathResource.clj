(ns org.nd4j.linalg.io.ClassPathResource
  "A slightly upgraded version of spring's
 classpath resource"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.io ClassPathResource]))

(defn ->class-path-resource
  "Constructor.

  path - `java.lang.String`
  class-loader - `java.lang.ClassLoader`"
  (^ClassPathResource [^java.lang.String path ^java.lang.ClassLoader class-loader]
    (new ClassPathResource path class-loader))
  (^ClassPathResource [^java.lang.String path]
    (new ClassPathResource path)))

(defn get-temp-file-from-archive
  "Get a temp file from the classpath, and (optionally) place it in the specified directory
  Note that:
  - If the directory is not specified, the file is copied to the default temporary directory, using
  Files.createTempFile(String, String, FileAttribute[]). Consequently, the extracted file will have a
  different filename to the extracted one.
  - If the directory *is* specified, the file is copied directly - and the original filename is maintained

  root-directory - May be null. If non-null, copy to the specified directory - `java.io.File`

  returns: the temp file - `java.io.File`

  throws: java.io.IOException - If an error occurs when files are being copied"
  (^java.io.File [^ClassPathResource this ^java.io.File root-directory]
    (-> this (.getTempFileFromArchive root-directory)))
  (^java.io.File [^ClassPathResource this]
    (-> this (.getTempFileFromArchive))))

(defn copy-directory
  "Extract the directory recursively to the specified location. Current ClassPathResource must point to
  a directory.
  For example, if classpathresource points to \"some/dir/\", then the contents - not including the parent directory \"dir\" -
  will be extracted or copied to the specified destination.

  destination - Destination directory. Must exist - `java.io.File`

  throws: java.io.IOException"
  ([^ClassPathResource this ^java.io.File destination]
    (-> this (.copyDirectory destination))))

(defn get-path
  "returns: `java.lang.String`"
  (^java.lang.String [^ClassPathResource this]
    (-> this (.getPath))))

(defn create-relative
  "relative-path - `java.lang.String`

  returns: `org.nd4j.linalg.io.Resource`"
  (^org.nd4j.linalg.io.Resource [^ClassPathResource this ^java.lang.String relative-path]
    (-> this (.createRelative relative-path))))

(defn get-filename
  "returns: `java.lang.String`"
  (^java.lang.String [^ClassPathResource this]
    (-> this (.getFilename))))

(defn get-class-loader
  "returns: `java.lang.ClassLoader`"
  (^java.lang.ClassLoader [^ClassPathResource this]
    (-> this (.getClassLoader))))

(defn get-description
  "returns: `java.lang.String`"
  (^java.lang.String [^ClassPathResource this]
    (-> this (.getDescription))))

(defn hash-code
  "returns: `int`"
  (^Integer [^ClassPathResource this]
    (-> this (.hashCode))))

(defn get-url
  "returns: `java.net.URL`

  throws: java.io.IOException"
  (^java.net.URL [^ClassPathResource this]
    (-> this (.getURL))))

(defn get-file
  "Get the File.
  If the file cannot be accessed directly (for example, it is in a JAR file), we will attempt to extract it from
  the JAR and copy it to the temporary directory, using getTempFileFromArchive()

  returns: The File, or a temporary copy if it can not be accessed directly - `java.io.File`

  throws: java.io.IOException"
  (^java.io.File [^ClassPathResource this]
    (-> this (.getFile))))

(defn exists?
  "Description copied from interface: Resource

  returns: `boolean`"
  (^Boolean [^ClassPathResource this]
    (-> this (.exists))))

(defn get-input-stream
  "returns: `java.io.InputStream`

  throws: java.io.IOException"
  (^java.io.InputStream [^ClassPathResource this]
    (-> this (.getInputStream))))

(defn equals
  "obj - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^ClassPathResource this ^java.lang.Object obj]
    (-> this (.equals obj))))

