job("jenkins_demo") {
	description()
	keepDependencies(false)
	disabled(false)
	concurrentBuild(false)
	steps {
		shell("""#!/bin/bash
# Clone the repository
git clone https://github.com/beerkeeper/python-ip-script.git
cd python-ip-script
pip install -r requirements.txt
python main.py""")
	}
}
