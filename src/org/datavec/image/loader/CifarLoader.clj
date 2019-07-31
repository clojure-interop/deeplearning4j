(ns org.datavec.image.loader.CifarLoader
  "CifarLoader is loader specific for the Cifar10 dataset
 Reference: Learning Multiple Layers of Features from Tiny Images, Alex Krizhevsky, 2009.
 There is a special preProcessor used to normalize the dataset based on Sergey Zagoruyko example
 https://github.com/szagoruyko/cifar.torch"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.image.loader CifarLoader]))

(defn ->cifar-loader
  "Constructor.

  height - `int`
  width - `int`
  channels - `int`
  img-transform - `org.datavec.image.transform.ImageTransform`
  train - `boolean`
  use-special-pre-process-cifar - `boolean`
  full-dir - `java.io.File`
  seed - `long`
  shuffle - `boolean`"
  (^CifarLoader [^Integer height ^Integer width ^Integer channels ^org.datavec.image.transform.ImageTransform img-transform ^Boolean train ^Boolean use-special-pre-process-cifar ^java.io.File full-dir ^Long seed ^Boolean shuffle]
    (new CifarLoader height width channels img-transform train use-special-pre-process-cifar full-dir seed shuffle))
  (^CifarLoader [^Integer height ^Integer width ^Integer channels ^org.datavec.image.transform.ImageTransform img-transform ^Boolean train ^Boolean use-special-pre-process-cifar ^Boolean shuffle]
    (new CifarLoader height width channels img-transform train use-special-pre-process-cifar shuffle))
  (^CifarLoader [^Integer height ^Integer width ^Integer channels ^org.datavec.image.transform.ImageTransform img-transform ^Boolean train ^Boolean use-special-pre-process-cifar]
    (new CifarLoader height width channels img-transform train use-special-pre-process-cifar))
  (^CifarLoader [^Integer height ^Integer width ^Integer channels ^Boolean train ^Boolean use-special-pre-process-cifar]
    (new CifarLoader height width channels train use-special-pre-process-cifar))
  (^CifarLoader [^Boolean train ^java.io.File full-path]
    (new CifarLoader train full-path))
  (^CifarLoader [^Boolean train]
    (new CifarLoader train))
  (^CifarLoader []
    (new CifarLoader )))

(def *-num-train-images
  "Static Constant.

  type: int"
  CifarLoader/NUM_TRAIN_IMAGES)

(def *-num-test-images
  "Static Constant.

  type: int"
  CifarLoader/NUM_TEST_IMAGES)

(def *-num-labels
  "Static Constant.

  type: int"
  CifarLoader/NUM_LABELS)

(def *-height
  "Static Constant.

  type: int"
  CifarLoader/HEIGHT)

(def *-width
  "Static Constant.

  type: int"
  CifarLoader/WIDTH)

(def *-channels
  "Static Constant.

  type: int"
  CifarLoader/CHANNELS)

(def *-default-use-special-preproc
  "Static Constant.

  type: boolean"
  CifarLoader/DEFAULT_USE_SPECIAL_PREPROC)

(def *-default-shuffle
  "Static Constant.

  type: boolean"
  CifarLoader/DEFAULT_SHUFFLE)

(defn *-cifar-data-map
  "Static Field.

  type: java.util.Map<java.lang.String,java.lang.String>"
  []
  CifarLoader/cifarDataMap)

(defn next
  "batch-size - `int`
  example-num - `int`

  returns: `org.nd4j.linalg.dataset.DataSet`"
  (^org.nd4j.linalg.dataset.DataSet [^CifarLoader this ^Integer batch-size ^Integer example-num]
    (-> this (.next batch-size example-num)))
  (^org.nd4j.linalg.dataset.DataSet [^CifarLoader this ^Integer batch-size]
    (-> this (.next batch-size))))

(defn convert-cifar
  "Preprocess and store cifar based on successful Torch approach by Sergey Zagoruyko
  Reference: https://github.com/szagoruyko/cifar.torch

  org-image - `org.bytedeco.javacpp.opencv_core.Mat`

  returns: `org.bytedeco.javacpp.opencv_core.Mat`"
  (^org.bytedeco.javacpp.opencv_core.Mat [^CifarLoader this ^org.bytedeco.javacpp.opencv_core.Mat org-image]
    (-> this (.convertCifar org-image))))

(defn as-matrix
  "f - `java.io.File`

  returns: `org.nd4j.linalg.api.ndarray.INDArray`

  throws: java.io.IOException"
  (^org.nd4j.linalg.api.ndarray.INDArray [^CifarLoader this ^java.io.File f]
    (-> this (.asMatrix f))))

(defn set-input-stream
  ""
  ([^CifarLoader this]
    (-> this (.setInputStream))))

(defn convert-mat
  "byte-feature - `byte[]`

  returns: `org.nd4j.linalg.primitives.Pair<org.nd4j.linalg.api.ndarray.INDArray,org.bytedeco.javacpp.opencv_core.Mat>`"
  (^org.nd4j.linalg.primitives.Pair [^CifarLoader this byte-feature]
    (-> this (.convertMat byte-feature))))

(defn reset
  ""
  ([^CifarLoader this]
    (-> this (.reset))))

(defn as-row-vector
  "Description copied from class: NativeImageLoader

  f - the image to convert - `java.io.File`

  returns: the flattened image - `org.nd4j.linalg.api.ndarray.INDArray`

  throws: java.io.IOException"
  (^org.nd4j.linalg.api.ndarray.INDArray [^CifarLoader this ^java.io.File f]
    (-> this (.asRowVector f))))

(defn get-labels
  "returns: `java.util.List<java.lang.String>`"
  (^java.util.List [^CifarLoader this]
    (-> this (.getLabels))))

(defn convert-data-set
  "num - `int`

  returns: `org.nd4j.linalg.dataset.DataSet`"
  (^org.nd4j.linalg.dataset.DataSet [^CifarLoader this ^Integer num]
    (-> this (.convertDataSet num))))

(defn get-input-stream
  "returns: `java.io.InputStream`"
  (^java.io.InputStream [^CifarLoader this]
    (-> this (.getInputStream))))

(defn normalize-cifar
  "Normalize and store cifar based on successful Torch approach by Sergey Zagoruyko
  Reference: https://github.com/szagoruyko/cifar.torch

  file-name - `java.io.File`"
  ([^CifarLoader this ^java.io.File file-name]
    (-> this (.normalizeCifar file-name))))

(defn var-manual
  "x - `org.nd4j.linalg.api.ndarray.INDArray`
  mean - `double`

  returns: `double`"
  (^Double [^CifarLoader this ^org.nd4j.linalg.api.ndarray.INDArray x ^Double mean]
    (-> this (.varManual x mean))))

