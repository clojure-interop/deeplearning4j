(ns org.nd4j.util.ArchiveUtils
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.util ArchiveUtils]))

(defn *unzip-file-to
  "Extracts files to the specified destination

  file - the file to extract to - `java.lang.String`
  dest - the destination directory - `java.lang.String`

  throws: java.io.IOException"
  ([^java.lang.String file ^java.lang.String dest]
    (ArchiveUtils/unzipFileTo file dest)))

