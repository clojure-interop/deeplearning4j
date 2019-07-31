(ns org.deeplearning4j.aws.ec2.provision.DistributedDeepLearningTrainer
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.aws.ec2.provision DistributedDeepLearningTrainer]))

(defn *main
  "args - `java.lang.String[]`"
  ([args]
    (DistributedDeepLearningTrainer/main args)))

