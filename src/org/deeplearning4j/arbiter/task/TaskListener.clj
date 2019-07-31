(ns org.deeplearning4j.arbiter.task.TaskListener
  "TaskListener: can be used to preprocess and post process a model (MultiLayerNetwork or ComputationGraph) before/after
 training, in a MultiLayerNetworkTaskCreator or ComputationGraphTaskCreator"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.arbiter.task TaskListener]))

(defn pre-process
  "Preprocess the model, before any training has taken place.

  Can be used to (for example) set listeners on a model before training starts

  model - Model to preprocess - `T`
  candidate - Candidate information, for the current model - `org.deeplearning4j.arbiter.optimize.api.Candidate`

  returns: The updated model (usually the same one as the input, perhaps with modifications) - `<T extends org.deeplearning4j.nn.api.Model> T`"
  ([^TaskListener this model ^org.deeplearning4j.arbiter.optimize.api.Candidate candidate]
    (-> this (.preProcess model candidate))))

(defn post-process
  "Post process the model, after any training has taken place

  model - Model to postprocess - `org.deeplearning4j.nn.api.Model`
  candidate - Candidate information, for the current model - `org.deeplearning4j.arbiter.optimize.api.Candidate`"
  ([^TaskListener this ^org.deeplearning4j.nn.api.Model model ^org.deeplearning4j.arbiter.optimize.api.Candidate candidate]
    (-> this (.postProcess model candidate))))

