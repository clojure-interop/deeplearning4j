(ns org.deeplearning4j.spark.time.TimeSourceProvider
  "TimeSourceProvider: used to get a TimeSource via a static method.
 Defaults to the Network Time Protocol implementation NTPTimeSource, but can be switched to other implementations
 via the TIMESOURCE_CLASSNAME_PROPERTY system property."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.spark.time TimeSourceProvider]))

(def *-default-timesource-class-name
  "Static Constant.

  Default class to use when getting a TimeSource instance

  type: java.lang.String"
  TimeSourceProvider/DEFAULT_TIMESOURCE_CLASS_NAME)

(def *-timesource-classname-property
  "Static Constant.

  Deprecated. Use DL4JSystemProperties.TIMESOURCE_CLASSNAME_PROPERTY

  type: java.lang.String"
  TimeSourceProvider/TIMESOURCE_CLASSNAME_PROPERTY)

(defn *get-instance
  "Get a specific TimeSource by class name

  class-name - Class name of the TimeSource to return the instance for - `java.lang.String`

  returns: TimeSource instance - `org.deeplearning4j.spark.time.TimeSource`"
  (^org.deeplearning4j.spark.time.TimeSource [^java.lang.String class-name]
    (TimeSourceProvider/getInstance class-name))
  (^org.deeplearning4j.spark.time.TimeSource []
    (TimeSourceProvider/getInstance )))

