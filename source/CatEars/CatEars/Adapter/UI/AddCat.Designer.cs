namespace CatEars.Adapter.UI
{
    partial class AddCat
    {
        /// <summary>
        /// Required designer variable.
        /// </summary>
        private System.ComponentModel.IContainer components = null;

        /// <summary>
        /// Clean up any resources being used.
        /// </summary>
        /// <param name="disposing">true if managed resources should be disposed; otherwise, false.</param>
        protected override void Dispose(bool disposing)
        {
            if (disposing && (components != null))
            {
                components.Dispose();
            }
            base.Dispose(disposing);
        }

        #region Windows Form Designer generated code

        /// <summary>
        /// Required method for Designer support - do not modify
        /// the contents of this method with the code editor.
        /// </summary>
        private void InitializeComponent()
        {
            this.uxCatName = new System.Windows.Forms.TextBox();
            this.label1 = new System.Windows.Forms.Label();
            this.label2 = new System.Windows.Forms.Label();
            this.uxCatBreed = new System.Windows.Forms.ComboBox();
            this.uxCancel = new System.Windows.Forms.Button();
            this.uxSave = new System.Windows.Forms.Button();
            this.SuspendLayout();
            // 
            // uxCatName
            // 
            this.uxCatName.Location = new System.Drawing.Point(52, 49);
            this.uxCatName.Name = "uxCatName";
            this.uxCatName.Size = new System.Drawing.Size(121, 20);
            this.uxCatName.TabIndex = 0;
            // 
            // label1
            // 
            this.label1.AutoSize = true;
            this.label1.Location = new System.Drawing.Point(11, 52);
            this.label1.Name = "label1";
            this.label1.Size = new System.Drawing.Size(35, 13);
            this.label1.TabIndex = 1;
            this.label1.Text = "Name";
            // 
            // label2
            // 
            this.label2.AutoSize = true;
            this.label2.Location = new System.Drawing.Point(11, 78);
            this.label2.Name = "label2";
            this.label2.Size = new System.Drawing.Size(35, 13);
            this.label2.TabIndex = 3;
            this.label2.Text = "Breed";
            // 
            // uxCatBreed
            // 
            this.uxCatBreed.FormattingEnabled = true;
            this.uxCatBreed.Location = new System.Drawing.Point(52, 75);
            this.uxCatBreed.Name = "uxCatBreed";
            this.uxCatBreed.Size = new System.Drawing.Size(121, 21);
            this.uxCatBreed.TabIndex = 4;
            // 
            // uxCancel
            // 
            this.uxCancel.Location = new System.Drawing.Point(12, 194);
            this.uxCancel.Name = "uxCancel";
            this.uxCancel.Size = new System.Drawing.Size(75, 23);
            this.uxCancel.TabIndex = 5;
            this.uxCancel.Text = "Cancel";
            this.uxCancel.UseVisualStyleBackColor = true;
            this.uxCancel.Click += new System.EventHandler(this.uxCancel_Click);
            // 
            // uxSave
            // 
            this.uxSave.Location = new System.Drawing.Point(238, 194);
            this.uxSave.Name = "uxSave";
            this.uxSave.Size = new System.Drawing.Size(75, 23);
            this.uxSave.TabIndex = 6;
            this.uxSave.Text = "Save";
            this.uxSave.UseVisualStyleBackColor = true;
            this.uxSave.Click += new System.EventHandler(this.uxSave_Click);
            // 
            // AddCat
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(6F, 13F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.ClientSize = new System.Drawing.Size(325, 229);
            this.Controls.Add(this.uxSave);
            this.Controls.Add(this.uxCancel);
            this.Controls.Add(this.uxCatBreed);
            this.Controls.Add(this.label2);
            this.Controls.Add(this.label1);
            this.Controls.Add(this.uxCatName);
            this.Name = "AddCat";
            this.Text = "AddCat";
            this.ResumeLayout(false);
            this.PerformLayout();

        }

        #endregion

        private System.Windows.Forms.TextBox uxCatName;
        private System.Windows.Forms.Label label1;
        private System.Windows.Forms.Label label2;
        private System.Windows.Forms.ComboBox uxCatBreed;
        private System.Windows.Forms.Button uxCancel;
        private System.Windows.Forms.Button uxSave;
    }
}