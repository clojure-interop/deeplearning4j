(ns org.deeplearning4j.zoo.model.YOLO2
  "YOLOv2
 Reference: https://arxiv.org/pdf/1612.08242.pdf
 ImageNet+COCO weights for this model are available and have been converted from https://pjreddie.com/darknet/yolo/
 using https://github.com/allanzelener/YAD2K and the following code.


      String filename = \"yolo.h5\";
      KerasLayer.registerCustomLayer(\"Lambda\", KerasSpaceToDepth.class);
      ComputationGraph graph = KerasModelImport.importKerasModelAndWeights(filename, false);
      INDArray priors = Nd4j.create(priorBoxes);

      FineTuneConfiguration fineTuneConf = new FineTuneConfiguration.Builder()
              .seed(seed)
              .optimizationAlgo(OptimizationAlgorithm.STOCHASTIC_GRADIENT_DESCENT)
              .gradientNormalization(GradientNormalization.RenormalizeL2PerLayer)
              .gradientNormalizationThreshold(1.0)
              .updater(new Adam.Builder().learningRate(1e-3).build())
              .l2(0.00001)
              .activation(Activation.IDENTITY)
              .trainingWorkspaceMode(workspaceMode)
              .inferenceWorkspaceMode(workspaceMode)
              .build();

      ComputationGraph model = new TransferLearning.GraphBuilder(graph)
              .fineTuneConfiguration(fineTuneConf)
              .addLayer(\"outputs\",
                      new Yolo2OutputLayer.Builder()
                              .boundingBoxPriors(priors)
                              .build(),
                      \"conv2d_23\")
              .setOutputs(\"outputs\")
              .build();

      System.out.println(model.summary(InputType.convolutional(608, 608, 3)));

      ModelSerializer.writeModel(model, \"yolo2_dl4j_inference.v1.zip\", false);
 The channels of the 608x608 input images need to be in RGB order (not BGR), with values normalized within [0, 1]."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.zoo.model YOLO2]))

(def *-default-prior-boxes
  "Static Constant.

  Default prior boxes for the model

  type: double[][]"
  YOLO2/DEFAULT_PRIOR_BOXES)

(defn pretrained-url
  "pretrained-type - `org.deeplearning4j.zoo.PretrainedType`

  returns: `java.lang.String`"
  (^java.lang.String [^YOLO2 this ^org.deeplearning4j.zoo.PretrainedType pretrained-type]
    (-> this (.pretrainedUrl pretrained-type))))

(defn pretrained-checksum
  "pretrained-type - `org.deeplearning4j.zoo.PretrainedType`

  returns: `long`"
  (^Long [^YOLO2 this ^org.deeplearning4j.zoo.PretrainedType pretrained-type]
    (-> this (.pretrainedChecksum pretrained-type))))

(defn model-type
  "returns: `java.lang.Class<? extends org.deeplearning4j.nn.api.Model>`"
  ([^YOLO2 this]
    (-> this (.modelType))))

(defn conf
  "returns: `org.deeplearning4j.nn.conf.ComputationGraphConfiguration`"
  (^org.deeplearning4j.nn.conf.ComputationGraphConfiguration [^YOLO2 this]
    (-> this (.conf))))

(defn init
  "returns: `org.deeplearning4j.nn.graph.ComputationGraph`"
  (^org.deeplearning4j.nn.graph.ComputationGraph [^YOLO2 this]
    (-> this (.init))))

(defn meta-data
  "returns: `org.deeplearning4j.zoo.ModelMetaData`"
  (^org.deeplearning4j.zoo.ModelMetaData [^YOLO2 this]
    (-> this (.metaData))))

(defn set-input-shape
  "input-shape - `int[][]`"
  ([^YOLO2 this input-shape]
    (-> this (.setInputShape input-shape))))

