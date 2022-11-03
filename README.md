# git-teamwork
Teamwork simulator repository

## Getting Started

### Git Hub + Bash

1. `fork` current repository to your GitHub account

2. `clone` your fork repository to your local repository
   ```js
   git clone https://github.com/`YOUR ACCOUNT HERE`/git-teamwork.git
   ```
   
3. Add remote `upstream` to your local repository
    ```js
   git remote add upstream https://github.com/Serhx4/git-teamwork.git
   ```
   
### GitHub + Idea

.. to be updated ..
   
## Teamwork lifecycle

1. Pull updates from `upstream` repository to your local repository (to get actual updates from your teammates)
    ```js
   git pull upstream master
   ```
   
2. Perform commits `git commit`

3. Push your changes to your `origin` repository (your fork repository)
    ```js
   git push origin master
   ```
   
4. Create `new pull request` on your GitHub fork repository. Don't forget to write a comment

5. Solve potential merge conflicts during our teamwork
