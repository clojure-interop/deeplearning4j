(ns org.deeplearning4j.optimize.listeners.EvaluativeListener
  "This TrainingListener implementation provides simple way for model evaluation during training.
 It can be launched every Xth Iteration/Epoch, depending on frequency and InvocationType constructor arguments"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.optimize.listeners EvaluativeListener]))

(defn ->evaluative-listener
  "Constructor.

  Evaluation will be launched after each *frequency* iteration

  iterator - `org.nd4j.linalg.dataset.api.iterator.DataSetIterator`
  frequency - `int`
  evaluations - `org.deeplearning4j.eval.IEvaluation`"
  (^EvaluativeListener [^org.nd4j.linalg.dataset.api.iterator.DataSetIterator iterator ^Integer frequency ^org.deeplearning4j.eval.IEvaluation evaluations]
    (new EvaluativeListener iterator frequency evaluations))
  (^EvaluativeListener [^org.nd4j.linalg.dataset.api.iterator.DataSetIterator iterator ^Integer frequency]
    (new EvaluativeListener iterator frequency))
  (^EvaluativeListener [^org.nd4j.linalg.dataset.api.iterator.DataSetIterator iterator ^Integer frequency ^org.deeplearning4j.optimize.api.InvocationType type ^org.deeplearning4j.eval.IEvaluation evaluations]
    (new EvaluativeListener iterator frequency type evaluations)))

(defn iteration-done
  "Event listener for each iteration

  model - the model iterating - `org.deeplearning4j.nn.api.Model`
  iteration - the iteration - `int`
  epoch - `int`"
  ([^EvaluativeListener this ^org.deeplearning4j.nn.api.Model model ^Integer iteration ^Integer epoch]
    (-> this (.iterationDone model iteration epoch))))

(defn on-epoch-start
  "Description copied from interface: TrainingListener

  model - `org.deeplearning4j.nn.api.Model`"
  ([^EvaluativeListener this ^org.deeplearning4j.nn.api.Model model]
    (-> this (.onEpochStart model))))

(defn on-epoch-end
  "Description copied from interface: TrainingListener

  model - `org.deeplearning4j.nn.api.Model`"
  ([^EvaluativeListener this ^org.deeplearning4j.nn.api.Model model]
    (-> this (.onEpochEnd model))))

