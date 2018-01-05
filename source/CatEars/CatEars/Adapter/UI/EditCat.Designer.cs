namespace CatEars.Adapter.UI
{
    partial class EditCat
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
            this.uxSave = new System.Windows.Forms.Button();
            this.uxCancel = new System.Windows.Forms.Button();
            this.uxCatBreed = new System.Windows.Forms.ComboBox();
            this.label2 = new System.Windows.Forms.Label();
            this.label1 = new System.Windows.Forms.Label();
            this.uxCatName = new System.Windows.Forms.TextBox();
            this.label3 = new System.Windows.Forms.Label();
            this.uxId = new System.Windows.Forms.TextBox();
            this.label4 = new System.Windows.Forms.Label();
            this.uxCreated = new System.Windows.Forms.TextBox();
            this.uxDeleted = new System.Windows.Forms.TextBox();
            this.label5 = new System.Windows.Forms.Label();
            this.uxUpdated = new System.Windows.Forms.TextBox();
            this.label6 = new System.Windows.Forms.Label();
            this.SuspendLayout();
            // 
            // uxSave
            // 
            this.uxSave.Location = new System.Drawing.Point(239, 212);
            this.uxSave.Name = "uxSave";
            this.uxSave.Size = new System.Drawing.Size(75, 23);
            this.uxSave.TabIndex = 12;
            this.uxSave.Text = "Save";
            this.uxSave.UseVisualStyleBackColor = true;
            this.uxSave.Click += new System.EventHandler(this.uxSave_Click);
            // 
            // uxCancel
            // 
            this.uxCancel.Location = new System.Drawing.Point(13, 212);
            this.uxCancel.Name = "uxCancel";
            this.uxCancel.Size = new System.Drawing.Size(75, 23);
            this.uxCancel.TabIndex = 11;
            this.uxCancel.Text = "Cancel";
            this.uxCancel.UseVisualStyleBackColor = true;
            this.uxCancel.Click += new System.EventHandler(this.uxCancel_Click);
            // 
            // uxCatBreed
            // 
            this.uxCatBreed.FormattingEnabled = true;
            this.uxCatBreed.Location = new System.Drawing.Point(53, 93);
            this.uxCatBreed.Name = "uxCatBreed";
            this.uxCatBreed.Size = new System.Drawing.Size(121, 21);
            this.uxCatBreed.TabIndex = 10;
            // 
            // label2
            // 
            this.label2.AutoSize = true;
            this.label2.Location = new System.Drawing.Point(12, 96);
            this.label2.Name = "label2";
            this.label2.Size = new System.Drawing.Size(35, 13);
            this.label2.TabIndex = 9;
            this.label2.Text = "Breed";
            // 
            // label1
            // 
            this.label1.AutoSize = true;
            this.label1.Location = new System.Drawing.Point(12, 70);
            this.label1.Name = "label1";
            this.label1.Size = new System.Drawing.Size(35, 13);
            this.label1.TabIndex = 8;
            this.label1.Text = "Name";
            // 
            // uxCatName
            // 
            this.uxCatName.Location = new System.Drawing.Point(53, 67);
            this.uxCatName.Name = "uxCatName";
            this.uxCatName.Size = new System.Drawing.Size(121, 20);
            this.uxCatName.TabIndex = 7;
            // 
            // label3
            // 
            this.label3.AutoSize = true;
            this.label3.Location = new System.Drawing.Point(31, 44);
            this.label3.Name = "label3";
            this.label3.Size = new System.Drawing.Size(16, 13);
            this.label3.TabIndex = 13;
            this.label3.Text = "Id";
            // 
            // uxId
            // 
            this.uxId.Location = new System.Drawing.Point(53, 41);
            this.uxId.Name = "uxId";
            this.uxId.ReadOnly = true;
            this.uxId.Size = new System.Drawing.Size(121, 20);
            this.uxId.TabIndex = 14;
            // 
            // label4
            // 
            this.label4.AutoSize = true;
            this.label4.Location = new System.Drawing.Point(3, 127);
            this.label4.Name = "label4";
            this.label4.Size = new System.Drawing.Size(44, 13);
            this.label4.TabIndex = 15;
            this.label4.Text = "Created";
            // 
            // uxCreated
            // 
            this.uxCreated.Location = new System.Drawing.Point(53, 124);
            this.uxCreated.Name = "uxCreated";
            this.uxCreated.ReadOnly = true;
            this.uxCreated.Size = new System.Drawing.Size(121, 20);
            this.uxCreated.TabIndex = 16;
            // 
            // uxDeleted
            // 
            this.uxDeleted.Location = new System.Drawing.Point(53, 176);
            this.uxDeleted.Name = "uxDeleted";
            this.uxDeleted.ReadOnly = true;
            this.uxDeleted.Size = new System.Drawing.Size(121, 20);
            this.uxDeleted.TabIndex = 18;
            // 
            // label5
            // 
            this.label5.AutoSize = true;
            this.label5.Location = new System.Drawing.Point(3, 179);
            this.label5.Name = "label5";
            this.label5.Size = new System.Drawing.Size(44, 13);
            this.label5.TabIndex = 17;
            this.label5.Text = "Deleted";
            // 
            // uxUpdated
            // 
            this.uxUpdated.Location = new System.Drawing.Point(53, 150);
            this.uxUpdated.Name = "uxUpdated";
            this.uxUpdated.ReadOnly = true;
            this.uxUpdated.Size = new System.Drawing.Size(121, 20);
            this.uxUpdated.TabIndex = 20;
            // 
            // label6
            // 
            this.label6.AutoSize = true;
            this.label6.Location = new System.Drawing.Point(-1, 153);
            this.label6.Name = "label6";
            this.label6.Size = new System.Drawing.Size(48, 13);
            this.label6.TabIndex = 19;
            this.label6.Text = "Updated";
            // 
            // EditCat
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(6F, 13F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.ClientSize = new System.Drawing.Size(322, 243);
            this.Controls.Add(this.uxUpdated);
            this.Controls.Add(this.label6);
            this.Controls.Add(this.uxDeleted);
            this.Controls.Add(this.label5);
            this.Controls.Add(this.uxCreated);
            this.Controls.Add(this.label4);
            this.Controls.Add(this.uxId);
            this.Controls.Add(this.label3);
            this.Controls.Add(this.uxSave);
            this.Controls.Add(this.uxCancel);
            this.Controls.Add(this.uxCatBreed);
            this.Controls.Add(this.label2);
            this.Controls.Add(this.label1);
            this.Controls.Add(this.uxCatName);
            this.Name = "EditCat";
            this.Text = "EditCat";
            this.ResumeLayout(false);
            this.PerformLayout();

        }

        #endregion

        private System.Windows.Forms.Button uxSave;
        private System.Windows.Forms.Button uxCancel;
        private System.Windows.Forms.ComboBox uxCatBreed;
        private System.Windows.Forms.Label label2;
        private System.Windows.Forms.Label label1;
        private System.Windows.Forms.TextBox uxCatName;
        private System.Windows.Forms.Label label3;
        private System.Windows.Forms.TextBox uxId;
        private System.Windows.Forms.Label label4;
        private System.Windows.Forms.TextBox uxCreated;
        private System.Windows.Forms.TextBox uxDeleted;
        private System.Windows.Forms.Label label5;
        private System.Windows.Forms.TextBox uxUpdated;
        private System.Windows.Forms.Label label6;
    }
}