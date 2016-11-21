# MovSim 
---------

Movsim == **M**ulti-model **o**pen-source **v**ehicular-traffic **Sim**ulator

Movsim's Homepage: [http://www.movsim.org](http://www.movsim.org)

Current build status for branch *Master*: [![Build Status Master](https://api.travis-ci.org/movsim/movsim.png?branch=master)](https://travis-ci.org/movsim/movsim)

Current build status for branch *develop*: [![Build Status Bidirectional](https://api.travis-ci.org/movsim/movsim.png?branch=develop)](https://travis-ci.org/movsim/movsim)

Quick links to this file:

* [Description](#description)
* [Documentation](#documentation)
* [Installation](#installation)
* [Usage](#usage)
* [Demos](#demos)
* [Commercial Use](#commercial-use)
* [Copyright and License](#copyright-and-license)
* [References](#references)


## Description
--------------

MovSim is a microscopic traffic simulator with xml-based configuration and csv text output.

Features:

- multi-lane simulator including onramps, offramps, "flow-conserving bottlenecks" and traffic-lights
- multiple models of different model classes (car-following models, coupled-map models and cellular automata)
  * Intelligent Driver Model (IDM) [Wikipedia](http://en.wikipedia.org/wiki/Intelligent_driver_model)
  * Enhanced IDM/Adaptive Cruise Control Model [Preprint] (http://arxiv.org/abs/0912.3613)
  * Optimal Velocity or Bando Model 
  * Velocity Difference Model 
  * Gipps Model [Wikipedia] (http://en.wikipedia.org/wiki/Gipps%27_Model)
  * Krauss Model
  * Nagel-Schreckenberg Cellular Automaton [Wikipedia] (http://en.wikipedia.org/wiki/Nagel-Schreckenberg_model)
  * Kerner-Klenov-Wolf Cellular Automaton
- general lane-changing model MOBIL [Paper](http://www.akesting.de/download/MOBIL_TRR_2007.pdf)
- detailed physics-based model for fuel consumption and emissions
- text-file output of detectors, spatiotemporal fields, floating-car data etc.

MovSim has several submodules/components: 

* The _core_ contains the main MovSim library and a console application that can run a traffic simulation and produce _.csv_ output for further processing or graphical display.
* The _viewer_ displays an animated traffic simulation.
* The _consumption_ comprises a physics-based fuel consumption model which can also be fed by csv data.
* The _xsd_ module comprises the xsd schema resources for the xml bindung (JAXB) 
* The _common_ provides general functionality for all submodules.

## Documentation
----------------

A mathematical description of the models as well as the basic concepts can be found in the book [Traffic Flow Dynamics](http://www.traffic-flow-dynamics.org) by Treiber/Kesting. A good starting point is the free chapter about [Car-Following Models based on Driving Strategies](http://traffic-flow-dynamics.org/res/SampleChapter11.pdf).

Documentation by example can be found in the [_sim_ directory](https://github.com/movsim/movsim/tree/develop/sim).


## Installation
---------------

Install the [git](http://git-scm.com/download) version control system and clone the repository via ssh

    git clone git@github.com:movsim/movsim.git
    
or via https (to prevent firewall problems)
       
    git clone https://github.com/movsim/movsim.git
              
[Java](http://openjdk.java.net/install/index.html) is required at least in version 7 (JRE 1.7).

[Apache Maven] (http://maven.apache.org/download.html) is the software build and management tool for MovSim.

MovSim produces csv/text-based output that can be plotted using [gnuplot](http://www.gnuplot.info/) or other tools. 


## Usage
--------

To build MovSim, type `mvn install` from the main MovSim directory.

To run the movsim _core_ or _viewer_ see their respective readme files: [core](https://github.com/movsim/movsim/blob/develop/core/README.md) and [viewer](https://github.com/movsim/movsim/blob/develop/viewer/README.md).


## Eclipse
----------

MovSim can be built and run from within the [Eclipse IDE](http://www.eclipse.org/downloads/) with the m2e(Maven Integration for Eclipse) plugin.

Import the project into Eclipse from the _File >> Import_ menu item. In the resulting Select dialog, choose the _General >> Existing Projects into Workspace_ option. In the resulting dialog select the `movsim/core` directory and import. Repeat for the `movsim/viewer` directory.

You can then build and run either the _core_ or _viewer_ Java applications.

We use the source code formatter _movsim/misc/codestyle/eclipse_movsim_profile.xml_.

## Development
--------------

We follow the naming conventions of the [Git Flow Model](http://nvie.com/posts/a-successful-git-branching-model/). Please checkout the branch *develop* to start with the latest source code. 

 
## Demos
--------

There are a number of simulation scenarios defined in the [_sim_ directory](https://github.com/movsim/movsim/tree/develop/sim).


##Commercial use
--------------

For commercial use, please contact the copyright holders at movsim@akesting.de


## Copyright and License
------------------------

MovSim is Copyright (C) 2010-2016 by Arne Kesting, Martin Treiber, Ralph Germ, and Martin Budden.

MovSim is licensed under [GPL version 3](https://github.com/movsim/movsim/blob/develop/COPYING).

For general questions use the contact at movsim.org@gmail.com.

## References 
-------------

[1] M. Treiber and A. Kesting. [Traffic Flow Dynamics, Data, Models and Simulation](http://www.traffic-flow-dynamics.org). Springer 2013. [Link](http://www.springer.com/physics/complexity/book/978-3-642-32459-8)

[2] A. Kesting, M. Treiber, and D. Helbing. General lane-changing model MOBIL for car-following models. 
    Transportation Research Record, 86-94 (2007). [Paper](http://www.akesting.de/download/MOBIL_TRR_2007.pdf)
    
[3] A. Kesting, M. Treiber, and D. Helbing. Enhanced intelligent driver model to access the impact of driving 
    strategies on traffic capacity. Philosophical Transactions of the Royal Society A, 4585-4605 (2010). [Preprint](http://arxiv.org/abs/0912.3613)
    
[4] A. Kesting, M. Treiber, and D. Helbing. Agents for Traffic Simulation. 
    Chapter 11 in "Multi-Agent Systems: Simulation and Applications", 325-356 (2009). [Preprint](http://arxiv.org/abs/0805.0300)
    
[5] M. Treiber, A. Kesting, and D. Helbing. Delays, inaccuracies and anticipation in microscopic traffic models.
    Physica A: Statistical Mechanics and its Applications 71-88 (2006). [Preprint](http://arxiv.org/abs/cond-mat/?0404736)

[6] M. Treiber, and A. Kesting. An open-source microscopic traffic simulator.
    IEEE Intelligent Transportation Systems Magazine, 6-13 (2010). [Preprint](http://arxiv.org/abs/1012.4913)
