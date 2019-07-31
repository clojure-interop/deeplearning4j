(ns org.deeplearning4j.arbiter.optimize.api.data.DataSetIteratorFactoryProvider
  "This is a DataProvider for
 an DataSetIteratorFactory which
 based on a key of FACTORY_KEY
 will create DataSetIterator
 for use with arbiter.
 This DataProvider is mainly meant for use for command line driven
 applications."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.arbiter.optimize.api.data DataSetIteratorFactoryProvider]))

(defn ->data-set-iterator-factory-provider
  "Constructor."
  (^DataSetIteratorFactoryProvider []
    (new DataSetIteratorFactoryProvider )))

(def *-factory-key
  "Static Constant.

  type: java.lang.String"
  DataSetIteratorFactoryProvider/FACTORY_KEY)

(defn train-data
  "Get training data given some parameters for the data.
  Data parameters map is used to specify things like batch
  size data preprocessing

  data-parameters - Parameters for data. May be null or empty for default data - `java.util.Map`

  returns: training data - `org.nd4j.linalg.dataset.api.iterator.DataSetIteratorFactory`"
  (^org.nd4j.linalg.dataset.api.iterator.DataSetIteratorFactory [^DataSetIteratorFactoryProvider this ^java.util.Map data-parameters]
    (-> this (.trainData data-parameters))))

(defn test-data
  "Get training data given some parameters for the data. Data parameters map
  is used to specify things like batch
  size data preprocessing

  data-parameters - Parameters for data. May be null or empty for default data - `java.util.Map`

  returns: training data - `org.nd4j.linalg.dataset.api.iterator.DataSetIteratorFactory`"
  (^org.nd4j.linalg.dataset.api.iterator.DataSetIteratorFactory [^DataSetIteratorFactoryProvider this ^java.util.Map data-parameters]
    (-> this (.testData data-parameters))))

(defn get-data-type
  "returns: `java.lang.Class<?>`"
  (^java.lang.Class [^DataSetIteratorFactoryProvider this]
    (-> this (.getDataType))))

