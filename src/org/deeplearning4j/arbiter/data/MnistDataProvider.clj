(ns org.deeplearning4j.arbiter.data.MnistDataProvider
  "MnistDataProvider - a DataProvider for the MNIST data set, with configurable number of epochs, batch size
 and RNG seed"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.arbiter.data MnistDataProvider]))

(defn ->mnist-data-provider
  "Constructor.

  num-epochs - `int`
  batch-size - `int`
  rng-seed - `int`"
  (^MnistDataProvider [^Integer num-epochs ^Integer batch-size ^Integer rng-seed]
    (new MnistDataProvider num-epochs batch-size rng-seed))
  (^MnistDataProvider [^Integer num-epochs ^Integer batch-size]
    (new MnistDataProvider num-epochs batch-size)))

(defn train-data
  "Description copied from interface: DataProvider

  data-parameters - Parameters for data. May be null or empty for default data - `java.util.Map`

  returns: training data - `java.lang.Object`"
  (^java.lang.Object [^MnistDataProvider this ^java.util.Map data-parameters]
    (-> this (.trainData data-parameters))))

(defn test-data
  "Description copied from interface: DataProvider

  data-parameters - Parameters for data. May be null or empty for default data - `java.util.Map`

  returns: training data - `java.lang.Object`"
  (^java.lang.Object [^MnistDataProvider this ^java.util.Map data-parameters]
    (-> this (.testData data-parameters))))

(defn get-data-type
  "returns: `java.lang.Class<?>`"
  (^java.lang.Class [^MnistDataProvider this]
    (-> this (.getDataType))))

