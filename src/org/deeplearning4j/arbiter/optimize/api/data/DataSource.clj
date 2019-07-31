(ns org.deeplearning4j.arbiter.optimize.api.data.DataSource
  "DataSource: defines where the data should come from for training and testing.
 Note that implementations must have a no-argument contsructor"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.arbiter.optimize.api.data DataSource]))

(defn configure
  "Configure the current data source with the specified properties
  Note: These properties are fixed for the training instance, and are optionally provided by the user
  at the configuration stage.
  The properties could be anything - and are usually specific to each DataSource implementation.
  For example, values such as batch size could be set using these properties

  properties - Properties to apply to the data source instance - `java.util.Properties`"
  ([^DataSource this ^java.util.Properties properties]
    (-> this (.configure properties))))

(defn train-data
  "Get test data to be used for the optimization. Usually a DataSetIterator or MultiDataSetIterator

  returns: `java.lang.Object`"
  (^java.lang.Object [^DataSource this]
    (-> this (.trainData))))

(defn test-data
  "Get test data to be used for the optimization. Usually a DataSetIterator or MultiDataSetIterator

  returns: `java.lang.Object`"
  (^java.lang.Object [^DataSource this]
    (-> this (.testData))))

(defn get-data-type
  "The type of data returned by trainData() and testData().
  Usually DataSetIterator or MultiDataSetIterator

  returns: Class of the objects returned by trainData and testData - `java.lang.Class<?>`"
  (^java.lang.Class [^DataSource this]
    (-> this (.getDataType))))

