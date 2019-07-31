(ns org.deeplearning4j.base.EmnistFetcher
  "Downloader for EMNIST dataset"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.base EmnistFetcher]))

(defn ->emnist-fetcher
  "Constructor.

  ds - `org.deeplearning4j.datasets.iterator.impl.EmnistDataSetIterator$Set`"
  (^EmnistFetcher [^org.deeplearning4j.datasets.iterator.impl.EmnistDataSetIterator$Set ds]
    (new EmnistFetcher ds)))

(defn *num-labels
  "data-set - `org.deeplearning4j.datasets.iterator.impl.EmnistDataSetIterator$Set`

  returns: `int`"
  (^Integer [^org.deeplearning4j.datasets.iterator.impl.EmnistDataSetIterator$Set data-set]
    (EmnistFetcher/numLabels data-set)))

(defn get-test-files-filename-unzipped
  "returns: `java.lang.String`"
  (^java.lang.String [^EmnistFetcher this]
    (-> this (.getTestFilesFilename_unzipped))))

(defn get-training-file-labels-md-5
  "returns: `java.lang.String`"
  (^java.lang.String [^EmnistFetcher this]
    (-> this (.getTrainingFileLabelsMD5))))

(defn get-test-file-labels-filename-unzipped
  "returns: `java.lang.String`"
  (^java.lang.String [^EmnistFetcher this]
    (-> this (.getTestFileLabelsFilename_unzipped))))

(defn get-test-files-md-5
  "returns: `java.lang.String`"
  (^java.lang.String [^EmnistFetcher this]
    (-> this (.getTestFilesMD5))))

(defn get-training-files-filename
  "returns: `java.lang.String`"
  (^java.lang.String [^EmnistFetcher this]
    (-> this (.getTrainingFilesFilename))))

(defn get-training-file-labels-filename
  "returns: `java.lang.String`"
  (^java.lang.String [^EmnistFetcher this]
    (-> this (.getTrainingFileLabelsFilename))))

(defn get-test-file-labels-md-5
  "returns: `java.lang.String`"
  (^java.lang.String [^EmnistFetcher this]
    (-> this (.getTestFileLabelsMD5))))

(defn get-test-files-url
  "returns: `java.lang.String`"
  (^java.lang.String [^EmnistFetcher this]
    (-> this (.getTestFilesURL))))

(defn get-training-files-filename-unzipped
  "returns: `java.lang.String`"
  (^java.lang.String [^EmnistFetcher this]
    (-> this (.getTrainingFilesFilename_unzipped))))

(defn get-name
  "returns: `java.lang.String`"
  (^java.lang.String [^EmnistFetcher this]
    (-> this (.getName))))

(defn get-test-file-labels-filename
  "returns: `java.lang.String`"
  (^java.lang.String [^EmnistFetcher this]
    (-> this (.getTestFileLabelsFilename))))

(defn get-test-file-labels-url
  "returns: `java.lang.String`"
  (^java.lang.String [^EmnistFetcher this]
    (-> this (.getTestFileLabelsURL))))

(defn get-training-file-labels-url
  "returns: `java.lang.String`"
  (^java.lang.String [^EmnistFetcher this]
    (-> this (.getTrainingFileLabelsURL))))

(defn get-training-files-url
  "returns: `java.lang.String`"
  (^java.lang.String [^EmnistFetcher this]
    (-> this (.getTrainingFilesURL))))

(defn get-training-files-md-5
  "returns: `java.lang.String`"
  (^java.lang.String [^EmnistFetcher this]
    (-> this (.getTrainingFilesMD5))))

(defn get-test-files-filename
  "returns: `java.lang.String`"
  (^java.lang.String [^EmnistFetcher this]
    (-> this (.getTestFilesFilename))))

(defn get-training-file-labels-filename-unzipped
  "returns: `java.lang.String`"
  (^java.lang.String [^EmnistFetcher this]
    (-> this (.getTrainingFileLabelsFilename_unzipped))))

