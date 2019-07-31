(ns org.datavec.image.loader.LFWLoader
  "Loads LFW faces data transform.
 Customize the size of images by passing in preferred dimensions.
 DataSet
 5749 different individuals
 1680 people have two or more images in the database
 4069 people have just a single image in the database
 available as 250 by 250 pixel JPEG images
 most images are in color, although a few are grayscale"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.image.loader LFWLoader]))

(defn ->lfw-loader
  "Constructor.

  img-dim - `int[]`
  img-transform - `org.datavec.image.transform.ImageTransform`
  use-subset - `boolean`"
  (^LFWLoader [img-dim ^org.datavec.image.transform.ImageTransform img-transform ^Boolean use-subset]
    (new LFWLoader img-dim img-transform use-subset))
  (^LFWLoader [img-dim ^Boolean use-subset]
    (new LFWLoader img-dim use-subset))
  (^LFWLoader [^Boolean use-subset]
    (new LFWLoader use-subset))
  (^LFWLoader []
    (new LFWLoader )))

(def *-num-images
  "Static Constant.

  type: int"
  LFWLoader/NUM_IMAGES)

(def *-num-labels
  "Static Constant.

  type: int"
  LFWLoader/NUM_LABELS)

(def *-sub-num-images
  "Static Constant.

  type: int"
  LFWLoader/SUB_NUM_IMAGES)

(def *-sub-num-labels
  "Static Constant.

  type: int"
  LFWLoader/SUB_NUM_LABELS)

(def *-height
  "Static Constant.

  type: int"
  LFWLoader/HEIGHT)

(def *-width
  "Static Constant.

  type: int"
  LFWLoader/WIDTH)

(def *-channels
  "Static Constant.

  type: int"
  LFWLoader/CHANNELS)

(def *-data-url
  "Static Constant.

  type: java.lang.String"
  LFWLoader/DATA_URL)

(def *-label-url
  "Static Constant.

  type: java.lang.String"
  LFWLoader/LABEL_URL)

(def *-subset-url
  "Static Constant.

  type: java.lang.String"
  LFWLoader/SUBSET_URL)

(def *-label-pattern
  "Static Constant.

  type: org.datavec.api.io.labels.PathLabelGenerator"
  LFWLoader/LABEL_PATTERN)

(defn data-file
  "Instance Field.

  type: java.lang.String"
  (^java.lang.String [^LFWLoader this]
    (-> this .-dataFile)))

(defn label-file
  "Instance Field.

  type: java.lang.String"
  (^java.lang.String [^LFWLoader this]
    (-> this .-labelFile)))

(defn subset-file
  "Instance Field.

  type: java.lang.String"
  (^java.lang.String [^LFWLoader this]
    (-> this .-subsetFile)))

(defn local-dir
  "Instance Field.

  type: java.lang.String"
  (^java.lang.String [^LFWLoader this]
    (-> this .-localDir)))

(defn local-sub-dir
  "Instance Field.

  type: java.lang.String"
  (^java.lang.String [^LFWLoader this]
    (-> this .-localSubDir)))

(defn *-lfw-data
  "Static Field.

  type: java.util.Map<java.lang.String,java.lang.String>"
  []
  LFWLoader/lfwData)

(defn *-lfw-label
  "Static Field.

  type: java.util.Map<java.lang.String,java.lang.String>"
  []
  LFWLoader/lfwLabel)

(defn *-lfw-subset-data
  "Static Field.

  type: java.util.Map<java.lang.String,java.lang.String>"
  []
  LFWLoader/lfwSubsetData)

(defn generate-lfw-maps
  ""
  ([^LFWLoader this]
    (-> this (.generateLfwMaps))))

(defn load
  "batch-size - `long`
  num-examples - `long`
  num-labels - `long`
  label-generator - `org.datavec.api.io.labels.PathLabelGenerator`
  split-train-test - `double`
  rng - `java.util.Random`"
  ([^LFWLoader this ^Long batch-size ^Long num-examples ^Long num-labels ^org.datavec.api.io.labels.PathLabelGenerator label-generator ^Double split-train-test ^java.util.Random rng]
    (-> this (.load batch-size num-examples num-labels label-generator split-train-test rng)))
  ([^LFWLoader this]
    (-> this (.load))))

(defn image-files-exist
  "returns: `boolean`"
  (^Boolean [^LFWLoader this]
    (-> this (.imageFilesExist))))

(defn get-record-reader
  "batch-size - `long`
  num-examples - `long`
  img-dim - `int[]`
  num-labels - `long`
  label-generator - `org.datavec.api.io.labels.PathLabelGenerator`
  train - `boolean`
  split-train-test - `double`
  rng - `java.util.Random`

  returns: `org.datavec.api.records.reader.RecordReader`"
  (^org.datavec.api.records.reader.RecordReader [^LFWLoader this ^Long batch-size ^Long num-examples img-dim ^Long num-labels ^org.datavec.api.io.labels.PathLabelGenerator label-generator ^Boolean train ^Double split-train-test ^java.util.Random rng]
    (-> this (.getRecordReader batch-size num-examples img-dim num-labels label-generator train split-train-test rng)))
  (^org.datavec.api.records.reader.RecordReader [^LFWLoader this ^Long batch-size ^Long num-examples img-dim ^org.datavec.api.io.labels.PathLabelGenerator label-generator ^Boolean train ^Double split-train-test ^java.util.Random rng]
    (-> this (.getRecordReader batch-size num-examples img-dim label-generator train split-train-test rng)))
  (^org.datavec.api.records.reader.RecordReader [^LFWLoader this ^Long batch-size ^Long num-examples img-dim ^Boolean train ^Double split-train-test ^java.util.Random rng]
    (-> this (.getRecordReader batch-size num-examples img-dim train split-train-test rng)))
  (^org.datavec.api.records.reader.RecordReader [^LFWLoader this ^Long batch-size ^Long num-examples ^Long num-labels ^java.util.Random rng]
    (-> this (.getRecordReader batch-size num-examples num-labels rng)))
  (^org.datavec.api.records.reader.RecordReader [^LFWLoader this ^Long num-examples]
    (-> this (.getRecordReader num-examples))))

(defn as-row-vector
  "f - `java.io.File`

  returns: `org.nd4j.linalg.api.ndarray.INDArray`

  throws: java.io.IOException"
  (^org.nd4j.linalg.api.ndarray.INDArray [^LFWLoader this ^java.io.File f]
    (-> this (.asRowVector f))))

(defn as-matrix
  "f - `java.io.File`

  returns: `org.nd4j.linalg.api.ndarray.INDArray`

  throws: java.io.IOException"
  (^org.nd4j.linalg.api.ndarray.INDArray [^LFWLoader this ^java.io.File f]
    (-> this (.asMatrix f))))

(defn as-image-matrix
  "f - `java.io.File`

  returns: `org.datavec.image.data.Image`

  throws: java.io.IOException"
  (^org.datavec.image.data.Image [^LFWLoader this ^java.io.File f]
    (-> this (.asImageMatrix f))))

