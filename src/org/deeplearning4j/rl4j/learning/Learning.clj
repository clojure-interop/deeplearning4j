(ns org.deeplearning4j.rl4j.learning.Learning
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.rl4j.learning Learning]))

(defn ->learning
  "Constructor.

  conf - `org.deeplearning4j.rl4j.learning.ILearning$LConfiguration`"
  (^Learning [^org.deeplearning4j.rl4j.learning.ILearning$LConfiguration conf]
    (new Learning conf)))

(defn *get-max-action
  "vector - `org.nd4j.linalg.api.ndarray.INDArray`

  returns: `java.lang.Integer`"
  (^java.lang.Integer [^org.nd4j.linalg.api.ndarray.INDArray vector]
    (Learning/getMaxAction vector)))

(defn *get-input
  "mdp - `org.deeplearning4j.rl4j.mdp.MDP`
  obs - `O`

  returns: `<O extends org.deeplearning4j.rl4j.space.Encodable,A,AS extends org.deeplearning4j.rl4j.space.ActionSpace<A>> org.nd4j.linalg.api.ndarray.INDArray`"
  ([^org.deeplearning4j.rl4j.mdp.MDP mdp obs]
    (Learning/getInput mdp obs)))

(defn *init-mdp
  "mdp - `org.deeplearning4j.rl4j.mdp.MDP`
  hp - `org.deeplearning4j.rl4j.learning.IHistoryProcessor`

  returns: `<O extends org.deeplearning4j.rl4j.space.Encodable,A,AS extends org.deeplearning4j.rl4j.space.ActionSpace<A>> org.deeplearning4j.rl4j.learning.Learning$InitMdp<O>`"
  ([^org.deeplearning4j.rl4j.mdp.MDP mdp ^org.deeplearning4j.rl4j.learning.IHistoryProcessor hp]
    (Learning/initMdp mdp hp)))

(defn *make-shape
  "batch - `int`
  shape - `int[]`
  length - `int`

  returns: `int[]`"
  ([^Integer batch shape ^Integer length]
    (Learning/makeShape batch shape length))
  ([^Integer size shape]
    (Learning/makeShape size shape)))

(defn get-neural-net
  "returns: `NN`"
  ([^Learning this]
    (-> this (.getNeuralNet))))

(defn increment-step
  "returns: `int`"
  (^Integer [^Learning this]
    (-> this (.incrementStep))))

(defn increment-epoch
  "returns: `int`"
  (^Integer [^Learning this]
    (-> this (.incrementEpoch))))

(defn set-history-processor
  "conf - `org.deeplearning4j.rl4j.learning.IHistoryProcessor$Configuration`"
  ([^Learning this ^org.deeplearning4j.rl4j.learning.IHistoryProcessor$Configuration conf]
    (-> this (.setHistoryProcessor conf))))

(defn get-input
  "obs - `O`

  returns: `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^Learning this obs]
    (-> this (.getInput obs))))

(defn init-mdp
  "returns: `org.deeplearning4j.rl4j.learning.Learning$InitMdp<O>`"
  (^org.deeplearning4j.rl4j.learning.Learning$InitMdp [^Learning this]
    (-> this (.initMdp))))

