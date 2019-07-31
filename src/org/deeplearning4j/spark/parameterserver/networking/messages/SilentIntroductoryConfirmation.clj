(ns org.deeplearning4j.spark.parameterserver.networking.messages.SilentIntroductoryConfirmation
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.spark.parameterserver.networking.messages SilentIntroductoryConfirmation]))

(defn ->silent-introductory-confirmation
  "Constructor."
  (^SilentIntroductoryConfirmation []
    (new SilentIntroductoryConfirmation )))

(defn process-message
  "Description copied from interface: VoidMessage"
  ([^SilentIntroductoryConfirmation this]
    (-> this (.processMessage))))

