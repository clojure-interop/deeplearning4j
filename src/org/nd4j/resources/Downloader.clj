(ns org.nd4j.resources.Downloader
  "Downloader utility methods"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.resources Downloader]))

(defn *download
  "Download the specified URL to the specified file, and verify that the target MD5 matches

  name - Name (mainly for providing useful exceptions) - `java.lang.String`
  url - URL to download - `java.net.URL`
  f - Destination file - `java.io.File`
  target-md-5 - Expected MD5 for file - `java.lang.String`
  max-tries - Maximum number of download attempts before failing and throwing an exception - `int`

  throws: java.io.IOException - If an error occurs during downloading"
  ([^java.lang.String name ^java.net.URL url ^java.io.File f ^java.lang.String target-md-5 ^Integer max-tries]
    (Downloader/download name url f target-md-5 max-tries)))

(defn *download-and-extract
  "Download the specified URL to the specified file, verify that the MD5 matches, and then extract it to the specified directory.
  Note that the file must be an archive, with the correct file extension: .zip, .jar, .tar.gz, .tgz or .gz

  name - Name (mainly for providing useful exceptions) - `java.lang.String`
  url - URL to download - `java.net.URL`
  f - Destination file - `java.io.File`
  extract-to-dir - Destination directory to extract all files - `java.io.File`
  target-md-5 - Expected MD5 for file - `java.lang.String`
  max-tries - Maximum number of download attempts before failing and throwing an exception - `int`

  throws: java.io.IOException - If an error occurs during downloading"
  ([^java.lang.String name ^java.net.URL url ^java.io.File f ^java.io.File extract-to-dir ^java.lang.String target-md-5 ^Integer max-tries]
    (Downloader/downloadAndExtract name url f extract-to-dir target-md-5 max-tries)))

(defn *check-md-5-of-file
  "Check the MD5 of the specified file

  target-md-5 - Expected MD5 - `java.lang.String`
  file - File to check - `java.io.File`

  returns: True if MD5 matches, false otherwise - `boolean`

  throws: java.io.IOException"
  (^Boolean [^java.lang.String target-md-5 ^java.io.File file]
    (Downloader/checkMD5OfFile target-md-5 file)))

