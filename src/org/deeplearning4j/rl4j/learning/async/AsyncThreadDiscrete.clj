(ns org.deeplearning4j.rl4j.learning.async.AsyncThreadDiscrete
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.rl4j.learning.async AsyncThreadDiscrete]))

(defn ->async-thread-discrete
  "Constructor.

  async-global - `org.deeplearning4j.rl4j.learning.async.AsyncGlobal`
  thread-number - `int`"
  (^AsyncThreadDiscrete [^org.deeplearning4j.rl4j.learning.async.AsyncGlobal async-global ^Integer thread-number]
    (new AsyncThreadDiscrete async-global thread-number)))

(defn train-sub-epoch
  "\"Subepoch\" correspond to the t_max-step iterations
  that stack rewards with t_max MiniTrans

  s-obs - the obs to start from - `O`
  nstep - the number of max nstep (step until t_max or state is terminal) - `int`

  returns: subepoch training informations - `org.deeplearning4j.rl4j.learning.async.AsyncThread$SubEpochReturn<O>`"
  (^org.deeplearning4j.rl4j.learning.async.AsyncThread$SubEpochReturn [^AsyncThreadDiscrete this s-obs ^Integer nstep]
    (-> this (.trainSubEpoch s-obs nstep))))

(defn calc-gradient
  "nn - `NN`
  rewards - `java.util.Stack`

  returns: `org.deeplearning4j.nn.gradient.Gradient[]`"
  ([^AsyncThreadDiscrete this nn ^java.util.Stack rewards]
    (-> this (.calcGradient nn rewards))))

