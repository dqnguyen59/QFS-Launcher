# Launcher for Quantum Field Simulator

## Introduction
This is a launcher for Quantum Field Simulator.

### Download binary files
| Platform | file          |
|----------|---------------|
| Windows  | <a href="https://github.com/dqnguyen59/QFS-Launcher/blob/main/binary/QuantumFieldSimulator-Windows-v1.19.zip">QuantumFieldSimulator-Windows-v1.19.zip</a> |
| MacOS    | <a href="https://github.com/dqnguyen59/QFS-Launcher/blob/main/binary/QuantumFieldSimulator-MacOS-v1.19.zip">QuantumFieldSimulator-MacOS-v1.19.zip</a> |
| Linux    | <a href="https://github.com/dqnguyen59/QFS-Launcher/blob/main/binary/QuantumFieldSimulator-Linux-v1.19.zip">QuantumFieldSimulator-Linux-v1.19.zip</a> |

Source code of these binaries can be found at <a href="https://github.com/dqnguyen59/QuantumFieldSimulator">https://github.com/dqnguyen59/QuantumFieldSimulator</a>.</br>

### CPU & GPU Performance for comparison
* OS: Ubuntu 20.04.5 LTS
* Processor: AMD Ryzen 9 3950x 16-core processor × 32 
* Graphics: AMD Radeon RX6800

| Nodes    | Visible Nodes | Width | Height | Depth | FPS |
|----------|---------------|-------|--------|-------|-----|
| 80631    | 6561          | 51    | 51     | 31    | 70  |
| 22801    | 22801         | 151   | 151    | 1     | 32  |
| 78961    | 78961         | 281   | 281    | 1     | 10  |

<p>
  Use of equivalent or more powerful hardware is recommended.</br>
  Recommended NVIDIA graphics cards: RTX2080Ti, RTX3070 or higher.
</p>

### Double-slit simulation
<img src="https://raw.githubusercontent.com/dqnguyen59/QuantumFieldSimulator/main/images/double_slit.png">

### Rain simulation
<img src="https://raw.githubusercontent.com/dqnguyen59/QuantumFieldSimulator/main/images/rain.png">

### Formulas used
<img src="https://raw.githubusercontent.com/dqnguyen59/QuantumFieldSimulator/main/images/qfs_formula.png">


<p>
  I am not a physicist and I have very little knowledge of the formulas used as shown in Wikipedia: <a href="https://en.wikipedia.org/wiki/Quantum_field_theory" target="_blank" rel="nofollow noopener noreferrer">Quantum field theory</a>.
  But I have discovered that the formula above works very well for simulating any waves and double slit experiments.
</p>
<p>
  The equation above is simply derived from the physics motion formula.
  Have a look at the QFSNode.java source code to see how this formula is derived and used in the code.
  Note that this is not the full quantum field formula, only the electric field is simulated.
  Note that v is not the speed of light, but is actually the speed of the node itself.
  The propagation of the light wave is caused by the motion of the node and the variable k determines the speed of light.
</p>

<p>
  Enjoy 😃
</p>

<p>
  <b>Todo:</b> add links to youtube videos and short tutorials
</p>
