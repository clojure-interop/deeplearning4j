(ns org.nd4j.linalg.io.ResourceUtils
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.io ResourceUtils]))

(defn ->resource-utils
  "Constructor."
  (^ResourceUtils []
    (new ResourceUtils )))

(def *-classpath-url-prefix
  "Static Constant.

  type: java.lang.String"
  ResourceUtils/CLASSPATH_URL_PREFIX)

(def *-file-url-prefix
  "Static Constant.

  type: java.lang.String"
  ResourceUtils/FILE_URL_PREFIX)

(def *-url-protocol-file
  "Static Constant.

  type: java.lang.String"
  ResourceUtils/URL_PROTOCOL_FILE)

(def *-url-protocol-jar
  "Static Constant.

  type: java.lang.String"
  ResourceUtils/URL_PROTOCOL_JAR)

(def *-url-protocol-zip
  "Static Constant.

  type: java.lang.String"
  ResourceUtils/URL_PROTOCOL_ZIP)

(def *-url-protocol-vfszip
  "Static Constant.

  type: java.lang.String"
  ResourceUtils/URL_PROTOCOL_VFSZIP)

(def *-url-protocol-vfs
  "Static Constant.

  type: java.lang.String"
  ResourceUtils/URL_PROTOCOL_VFS)

(def *-url-protocol-wsjar
  "Static Constant.

  type: java.lang.String"
  ResourceUtils/URL_PROTOCOL_WSJAR)

(def *-url-protocol-code-source
  "Static Constant.

  type: java.lang.String"
  ResourceUtils/URL_PROTOCOL_CODE_SOURCE)

(def *-jar-url-separator
  "Static Constant.

  type: java.lang.String"
  ResourceUtils/JAR_URL_SEPARATOR)

(defn *url?
  "resource-location - `java.lang.String`

  returns: `boolean`"
  (^Boolean [^java.lang.String resource-location]
    (ResourceUtils/isUrl resource-location)))

(defn *get-url
  "resource-location - `java.lang.String`

  returns: `java.net.URL`

  throws: java.io.FileNotFoundException"
  (^java.net.URL [^java.lang.String resource-location]
    (ResourceUtils/getURL resource-location)))

(defn *get-file
  "resource-url - `java.net.URL`
  description - `java.lang.String`

  returns: `java.io.File`

  throws: java.io.FileNotFoundException"
  (^java.io.File [^java.net.URL resource-url ^java.lang.String description]
    (ResourceUtils/getFile resource-url description))
  (^java.io.File [^java.lang.String resource-location]
    (ResourceUtils/getFile resource-location)))

(defn *file-url?
  "url - `java.net.URL`

  returns: `boolean`"
  (^Boolean [^java.net.URL url]
    (ResourceUtils/isFileURL url)))

(defn *jar-url?
  "url - `java.net.URL`

  returns: `boolean`"
  (^Boolean [^java.net.URL url]
    (ResourceUtils/isJarURL url)))

(defn *extract-jar-file-url
  "jar-url - `java.net.URL`

  returns: `java.net.URL`

  throws: java.net.MalformedURLException"
  (^java.net.URL [^java.net.URL jar-url]
    (ResourceUtils/extractJarFileURL jar-url)))

(defn *to-uri
  "url - `java.net.URL`

  returns: `java.net.URI`

  throws: java.net.URISyntaxException"
  (^java.net.URI [^java.net.URL url]
    (ResourceUtils/toURI url)))

(defn *use-caches-if-necessary
  "con - `java.net.URLConnection`"
  ([^java.net.URLConnection con]
    (ResourceUtils/useCachesIfNecessary con)))

