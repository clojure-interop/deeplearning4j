(ns org.datavec.image.mnist.MnistFetcher
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.image.mnist MnistFetcher]))

(defn ->mnist-fetcher
  "Constructor."
  (^MnistFetcher []
    (new MnistFetcher )))

(def *-training-files-filename-unzipped
  "Static Constant.

  type: java.lang.String"
  MnistFetcher/trainingFilesFilename_unzipped)

(def *-training-file-labels-filename-unzipped
  "Static Constant.

  type: java.lang.String"
  MnistFetcher/trainingFileLabelsFilename_unzipped)

(defn *gunzip-file
  "base-dir - `java.io.File`
  gz-file - `java.io.File`

  throws: java.io.IOException"
  ([^java.io.File base-dir ^java.io.File gz-file]
    (MnistFetcher/gunzipFile base-dir gz-file)))

(defn download-and-untar
  "returns: `java.io.File`

  throws: java.io.IOException"
  (^java.io.File [^MnistFetcher this]
    (-> this (.downloadAndUntar))))

(defn untar-file
  "base-dir - `java.io.File`
  tar-file - `java.io.File`

  throws: java.io.IOException"
  ([^MnistFetcher this ^java.io.File base-dir ^java.io.File tar-file]
    (-> this (.untarFile base-dir tar-file))))

