(ns org.deeplearning4j.spark.parameterserver.networking.messages.SilentIntroductoryMessage
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.spark.parameterserver.networking.messages SilentIntroductoryMessage]))

(defn ->silent-introductory-message
  "Constructor.

  local-ip - `java.lang.String`
  port - `int`"
  (^SilentIntroductoryMessage [^java.lang.String local-ip ^Integer port]
    (new SilentIntroductoryMessage local-ip port)))

(defn process-message
  "Description copied from interface: VoidMessage"
  ([^SilentIntroductoryMessage this]
    (-> this (.processMessage))))

(defn blocking-message?
  "returns: `boolean`"
  (^Boolean [^SilentIntroductoryMessage this]
    (-> this (.isBlockingMessage))))

