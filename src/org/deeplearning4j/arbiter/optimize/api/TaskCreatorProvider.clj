(ns org.deeplearning4j.arbiter.optimize.api.TaskCreatorProvider
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.arbiter.optimize.api TaskCreatorProvider]))

(defn ->task-creator-provider
  "Constructor."
  (^TaskCreatorProvider []
    (new TaskCreatorProvider )))

(defn *default-task-creator-for
  "param-space-class - `java.lang.Class`

  returns: `org.deeplearning4j.arbiter.optimize.api.TaskCreator`"
  (^org.deeplearning4j.arbiter.optimize.api.TaskCreator [^java.lang.Class param-space-class]
    (TaskCreatorProvider/defaultTaskCreatorFor param-space-class)))

(defn *register-default-task-creator-class
  "space-class - `java.lang.Class`
  creator-class - `java.lang.Class`"
  ([^java.lang.Class space-class ^java.lang.Class creator-class]
    (TaskCreatorProvider/registerDefaultTaskCreatorClass space-class creator-class)))

