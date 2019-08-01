(ns org.deeplearning4j.base.MnistFetcher
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.base MnistFetcher]))

(defn ->mnist-fetcher
  "Constructor."
  (^MnistFetcher []
    (new MnistFetcher )))

(def *-training-files-filename-unzipped
  "Static Constant.

  type: java.lang.String"
  MnistFetcher/TRAINING_FILES_FILENAME_UNZIPPED)

(def *-training-file-labels-filename-unzipped
  "Static Constant.

  type: java.lang.String"
  MnistFetcher/TRAINING_FILE_LABELS_FILENAME_UNZIPPED)

(def *-test-files-filename-unzipped
  "Static Constant.

  type: java.lang.String"
  MnistFetcher/TEST_FILES_FILENAME_UNZIPPED)

(def *-test-file-labels-filename-unzipped
  "Static Constant.

  type: java.lang.String"
  MnistFetcher/TEST_FILE_LABELS_FILENAME_UNZIPPED)

(defn get-test-files-filename-unzipped
  "returns: `java.lang.String`"
  (^java.lang.String [^MnistFetcher this]
    (-> this (.getTestFilesFilename_unzipped))))

(defn get-training-file-labels-md-5
  "returns: `java.lang.String`"
  (^java.lang.String [^MnistFetcher this]
    (-> this (.getTrainingFileLabelsMD5))))

(defn get-test-file-labels-filename-unzipped
  "returns: `java.lang.String`"
  (^java.lang.String [^MnistFetcher this]
    (-> this (.getTestFileLabelsFilename_unzipped))))

(defn get-test-files-md-5
  "returns: `java.lang.String`"
  (^java.lang.String [^MnistFetcher this]
    (-> this (.getTestFilesMD5))))

(defn get-training-files-filename
  "returns: `java.lang.String`"
  (^java.lang.String [^MnistFetcher this]
    (-> this (.getTrainingFilesFilename))))

(defn get-training-file-labels-filename
  "returns: `java.lang.String`"
  (^java.lang.String [^MnistFetcher this]
    (-> this (.getTrainingFileLabelsFilename))))

(defn get-test-file-labels-md-5
  "returns: `java.lang.String`"
  (^java.lang.String [^MnistFetcher this]
    (-> this (.getTestFileLabelsMD5))))

(defn get-test-files-url
  "returns: `java.lang.String`"
  (^java.lang.String [^MnistFetcher this]
    (-> this (.getTestFilesURL))))

(defn get-base-dir
  "returns: `java.io.File`"
  (^java.io.File [^MnistFetcher this]
    (-> this (.getBaseDir))))

(defn download-and-untar
  "returns: `java.io.File`

  throws: java.io.IOException"
  (^java.io.File [^MnistFetcher this]
    (-> this (.downloadAndUntar))))

(defn get-training-files-filename-unzipped
  "returns: `java.lang.String`"
  (^java.lang.String [^MnistFetcher this]
    (-> this (.getTrainingFilesFilename_unzipped))))

(defn get-name
  "returns: `java.lang.String`"
  (^java.lang.String [^MnistFetcher this]
    (-> this (.getName))))

(defn get-test-file-labels-filename
  "returns: `java.lang.String`"
  (^java.lang.String [^MnistFetcher this]
    (-> this (.getTestFileLabelsFilename))))

(defn get-test-file-labels-url
  "returns: `java.lang.String`"
  (^java.lang.String [^MnistFetcher this]
    (-> this (.getTestFileLabelsURL))))

(defn get-training-file-labels-url
  "returns: `java.lang.String`"
  (^java.lang.String [^MnistFetcher this]
    (-> this (.getTrainingFileLabelsURL))))

(defn get-training-files-url
  "returns: `java.lang.String`"
  (^java.lang.String [^MnistFetcher this]
    (-> this (.getTrainingFilesURL))))

(defn get-training-files-md-5
  "returns: `java.lang.String`"
  (^java.lang.String [^MnistFetcher this]
    (-> this (.getTrainingFilesMD5))))

(defn get-test-files-filename
  "returns: `java.lang.String`"
  (^java.lang.String [^MnistFetcher this]
    (-> this (.getTestFilesFilename))))

(defn get-training-file-labels-filename-unzipped
  "returns: `java.lang.String`"
  (^java.lang.String [^MnistFetcher this]
    (-> this (.getTrainingFileLabelsFilename_unzipped))))

